package loopsL7;

import java.util.Scanner;

public class triangle_patern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        *
//        **
//        ***
//        ****
//        int r = sc.nextInt();
//        for(int i = 1; i<=r; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        reverse patern printing
//        ****
//        ***
//        **
//        *
        int r = sc.nextInt();
        for(int i= r; i >=1; i--){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
