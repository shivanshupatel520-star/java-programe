package basicsjava;

import java.util.Scanner;

class sumofdigit {
  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println("welcome to sum of digit");
   System.out.println("enter your number ");
   int num = input.nextInt();
   int sum =sumofdigit(num);
   System.out.println("sum of digit is "+ sum);
  }
  public static int sumofdigit( int num){
     int sum=0;
    while(num > 0){
     sum +=num %10;
     num/=10;

    }
    return sum;
  }
}
