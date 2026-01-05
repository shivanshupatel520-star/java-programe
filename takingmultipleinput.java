package loopsL7;

import java.util.Scanner;

public class takingmultipleinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        do{
            sum +=num;
            num = sc.nextInt();
        }while(num!=-1);
//
//        while(num!=-1){
//            sum = sum +num;
//            num = sc.nextInt();
//        }
        System.out.println(sum);
    }
}
