package codvita;

import java.util.*;
public class Zoobin {
    static int n;
    static boolean[][] A, B;
    static List<int[]> iso = new ArrayList<>();
    static List<int[]> cyclePerms = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        List<int[]> eA = new ArrayList<>(), eB = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<E;i++){
            int u = sc.nextInt(), v = sc.nextInt();
            eA.add(new int[]{u,v}); set.add(u); set.add(v);
        }
        for(int i=0;i<E;i++){
            int u = sc.nextInt(), v = sc.nextInt();
            eB.add(new int[]{u,v}); set.add(u); set.add(v);
        }

        // map nodes to 0..n-1
        n = set.size();
        int[] arr = new int[n]; int idx=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int val: set){ arr[idx]=val; mp.put(val,idx++); }

        A = new boolean[n][n];
        B = new boolean[n][n];
        for(var e: eA){ int u=mp.get(e[0]),v=mp.get(e[1]); A[u][v]=A[v][u]=true; }
        for(var e: eB){ int u=mp.get(e[0]),v=mp.get(e[1]); B[u][v]=B[v][u]=true; }

        // find all isomorphisms
        boolean[] used = new boolean[n];
        int[] perm = new int[n];
        backtrack(0,perm,used);

        if(iso.isEmpty()){ System.out.println(-1); return; }

        // find cycles in A
        findCycles();

        int ans = Integer.MAX_VALUE;
        for(int[] p: iso){
            int d = bfs(p);
            if(d>=0) ans = Math.min(ans,d);
        }
        System.out.println(ans);
    }

    static void backtrack(int i, int[] perm, boolean[] used){
        if(i==n){
            // full check
            for(int a=0;a<n;a++)
                for(int b=0;b<n;b++)
                    if(A[a][b] != B[perm[a]][perm[b]]) return;
            iso.add(perm.clone());
            return;
        }
        for(int x=0;x<n;x++){
            if(!used[x]){
                perm[i]=x; used[x]=true;
                boolean ok=true;
                for(int j=0;j<i;j++){
                    if(A[i][j] != B[perm[i]][perm[j]]){ ok=false; break; }
                }
                if(ok) backtrack(i+1,perm,used);
                used[x]=false;
            }
        }
    }

    static void findCycles(){
        for(int start=0;start<n;start++){
            boolean[] vis = new boolean[n];
            ArrayDeque<Integer> path = new ArrayDeque<>();
            path.add(start);
            dfs(start,start,vis,path);
        }
    }

    static void dfs(int s,int cur, boolean[] vis, Deque<Integer> path){
        vis[cur] = true;
        for(int nb=0;nb<n;nb++){
            if(!A[cur][nb]) continue;
            if(nb==s && path.size()>=3){
                int min=path.peekFirst();
                for(int v: path) if(v<min) min=v;
                if(min!=s) continue;
                makeCycle(path);
            }
            else if(!vis[nb] && nb>s){
                path.addLast(nb);
                dfs(s,nb,vis,path);
                path.removeLast();
            }
        }
        vis[cur]=false;
    }

    static void makeCycle(Deque<Integer> cyc){
        int[] map = new int[n];
        for(int i=0;i<n;i++) map[i]=i;
        Integer[] arr = cyc.toArray(new Integer[0]);
        for(int i=0;i<arr.length;i++){
            int u=arr[i], v=arr[(i+1)%arr.length];
            map[u]=v;
        }
        cyclePerms.add(map);
    }

    static int bfs(int[] target){
        String tgt = key(target);
        String start = key(identity());
        if(start.equals(tgt)) return 0;
        Queue<String> q = new ArrayDeque<>();
        Map<String,Integer> dist = new HashMap<>();
        dist.put(start,0); q.add(start);

        while(!q.isEmpty()){
            String curK = q.poll();
            int d = dist.get(curK);
            int[] cur = parse(curK);
            for(int[] g: cyclePerms){
                int[] nxt = new int[n];
                for(int i=0;i<n;i++) nxt[i] = g[cur[i]];
                String nk = key(nxt);
                if(!dist.containsKey(nk)){
                    if(nk.equals(tgt)) return d+1;
                    dist.put(nk,d+1);
                    q.add(nk);
                }
            }
        }
        return -1;
    }

    static int[] identity(){ int[] x=new int[n]; for(int i=0;i<n;i++) x[i]=i; return x; }
    static String key(int[] p){ StringBuilder sb=new StringBuilder(); for(int i=0;i<n;i++){ sb.append(p[i]).append(','); } return sb.toString(); }
    static int[] parse(String s){ String[] sp=s.split(","); int[] p=new int[n]; for(int i=0;i<n;i++) p[i]=Integer.parseInt(sp[i]); return p; }
}