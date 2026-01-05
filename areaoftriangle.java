package basicsjava;

import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter base of triangle");
        double base= input.nextDouble();

        System.out.println("enter height of triangle");
        double height= input.nextDouble();

        double area= (base*height)/2;
        System.out.println(area + "cm2");

    }
}
