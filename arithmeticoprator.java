package basicsjava;

import java.util.Scanner;

public class arithmeticoprator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your first no A");
        int a= input.nextInt();
        System.out.println("enter your second no b");
        int b= input.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);

    }
}
