package basicsjava;

import java.util.Scanner;

class oddsum {
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("welcome to sum of odd digit");
         System.out.println("please enter your number ");
         int num = input.nextInt();
         int sum=oddsum(num);
         System.out.println("sum till num"+ num +"is : " + sum);

     }
     public static int oddsum(int num){
         int sum=0;
         int i =1;
         while(i<= num){
              sum =sum +i;
             i = i +2;
         }
         return sum;


     }
}
