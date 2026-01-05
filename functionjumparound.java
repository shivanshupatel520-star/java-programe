package basicsjava;

import java.util.Scanner;

public class functionjumparound {
    public static void main(String[] args) {

        greet();

        int first= readnumber();

        int second= readnumber();

        int sum =first + second;
        System.out.println("sum of two number is " +sum);
    }
    public static int readnumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your first number");
        int number= input.nextInt();
        return number;
    }
    public static void greet(){
        System.out.println("welcome to the calculator \n");
    }

}
