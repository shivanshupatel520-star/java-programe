package basicsjava;

import java.util.Scanner;

class fibpnacciseries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to fibonacci series");
        System.out.println("enter your  number ");
        int num = input.nextInt();
        System.out.println("your fibonacci series is");
        fibonacci(num);
    }
    public static void fibonacci(int num){
        if (num <0)return;
        System.out.print("0 ");
        if(num ==0)return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while(first + second <= num){
          int third= first+ second;
            System.out.print(third + " ");
            first=second;
            second=third;

        }
    }
}
