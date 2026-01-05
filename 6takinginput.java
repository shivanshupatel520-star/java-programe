package array;

import java.util.Scanner;

class takinginput {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter size of an array");
         int n = sc.nextInt();
         int [] arr = new int[n];
         //input
         System.out.println("enter element of an array");
         for(int i=0; i<n; i++){
             arr[i] =sc.nextInt();
         }
         //output
         for(int i=0; i<n; i++){
             System.out.print(arr[i]+" ");
         }
     }
}
