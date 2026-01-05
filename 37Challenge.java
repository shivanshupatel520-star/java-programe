package basicsjava;

import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int num1= 153;
        int count =0;
        int sum=0;
        while(num1!=0) {
            int digit= num1 % 10;
             sum += Math.pow(digit,n);
             num1/= 10;
             if(sum == num1){
                 System.out.println("yes");
             }
else{
                 System.out.println("no");
             }



        }

    }
}
