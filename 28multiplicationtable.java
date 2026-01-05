package basicsjava;

import java.util.Scanner;

class multiplicationtable {
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("welcome to multiplication table");
         System.out.println("please enter your number");
         int num = input.nextInt();
         printmultiplicationtable(num);
     }
     public static void printmultiplicationtable( int num ){
         int i = 1;
         while(i<=10){
             System.out.println( num + "x" + i + " = "+ (num *i));
             i++;
         }
     }
}
