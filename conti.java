package loopsL7;

import java.util.Scanner;

public class conti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n<=50){
           if(n%3!=0 && n%2!=0){
               System.out.println(n);
           }
           //System.out.println(n);
           n++;
       }
    }
}
