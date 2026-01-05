package basicsjava;

import java.util.Scanner;

class primenumber {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to prime number checker");
         System.out.println("enter your  number ");
         int num = input.nextInt();
         boolean isprime = isprime(num);
         if(isprime){
             System.out.println("your number is prime");
         }else{
             System.out.println("your number is not prime");
         }
     }
     public static  boolean  isprime(int num){
         int i = 2;
         while(i <num){
             if(num % i ==0){
                 return false;
             }
             i++;
         }
         return true;
     }
}
