package basicsjava;

public class argumentandparameter {
    public static void main(String[] args) {
        System.out.println(sumtwonumber(4,6));
        System.out.println(sumtwonumber(12,13));
        System.out.println(sumtwonumber(48,45));
    }
    public static int sumtwonumber(int first,int second){
        System.out.println("first number recived "+ first);
        System.out.println("second number recived "+ second);
        int sum = first+second;
        return sum;
    }
}
