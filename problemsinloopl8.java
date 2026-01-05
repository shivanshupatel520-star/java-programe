package loopsL7;

import java.util.Scanner;

public class problemsinloopl8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numofdigit = 0;
         int original_n = n;
        while(n>0){
           n = n/10;
            numofdigit++;
        }
        System.out.println("numofdigit in " + original_n + "="+ numofdigit);
    }
}
