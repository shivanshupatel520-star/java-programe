package basicsjava;

import java.util.Scanner;

class palindrome {
  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println("welcome to reverse digit");
   System.out.println("enter your  number ");
   int num = input.nextInt();
   boolean ispalindrome= ispalindrome(num);
   if(ispalindrome){
    System.out.println("your number is palindrome");
   }else{
    System.out.println("your number is not a palindrome number");
   }
  }
  public static boolean ispalindrome(int num){
   return num==reverse(num);
  }

 public static int reverse(int num){
  int newnum = 0;
  while(num >0){
   int digit= num % 10;
   newnum= newnum* 10 + digit;
   num/=10;
  }
  return newnum;
 }
}
