package array;

import java.util.Scanner;

class inputAndoutput {
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("enter size of an array");
         int n = input.nextInt();
         int[] arr= new int[n];
         //input
         System.out.println("enter array elements");
         for(int i=0; i<n; i++ ){
             arr[i]=input.nextInt();
         }
         //output
         int s=0;
         for(int i=0; i<n; i++){
            // System.out.println(arr[i]+" ");
             s+=arr[i];
         }
         System.out.println(s);
     }
}
