package basicsjava;

import java.util.Scanner;

class armstrong {
  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println("welcome to armstrong number");
   System.out.println("enter your  number ");
   int num = input.nextInt();
   boolean isarmstrong= isarmstrong(num);
   if(isarmstrong){
    System.out.println("your number is armstrong");
   }else{
    System.out.println("no your number is not armstrong number");
   }

  }
   public static boolean isarmstrong(int num ){
   int noofdigits=noofdigits( num);
   int numcopy=num;
   int finalnumber=0;
   while(num > 0){
    int lastdigit= num % 10;
    num/=10;
    finalnumber+=pow(lastdigit, noofdigits);
   }
   return finalnumber == numcopy;

   }
  public static int pow(int num1,int num2){
   int result= 1;
   int i=0;
   while(i < num2){
    result= result *num1;
    i++;
   }
   return result;
  }
  public static int noofdigits(int num){
   int digit= 0;
   while(num> 0){
    digit++;
    num= num/10;
   }
      return digit;
  }
}
