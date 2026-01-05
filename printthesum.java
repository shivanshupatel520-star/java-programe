package loopsL7;

import java.util.Scanner;
//print the sum of the following series
//  s = 1-2+3-4+5
public class printthesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int ans = 0;
         for( int i = 1; i <=n; i++){
             if(i % 2==0){
                 ans = ans - i;
             }else{
                 ans = ans + i;
             }
         }
        System.out.println(ans);
    }
}
