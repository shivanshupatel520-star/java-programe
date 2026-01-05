package basicsjava;

import java.util.Scanner;

public class progtocalculateproductoftwofloatingnumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("float multiplication");
        System.out.println("enter your first number");
        double a= input.nextDouble();
        System.out.println("enter your second number");
        double b= input.nextDouble();

        double mul= a*b;
        System.out.println("result "+ mul);
    }
}
