package basicsjava;

import java.util.Scanner;

class patternprinting {
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("welcome to patern printing ");
         System.out.println("enter the number of rows ");
         int rows= input.nextInt();
         printrighthalfpyramid(rows);
         printreverserighthalfpyramid(rows);
     }
     public static void printreverserighthalfpyramid(int maxrows){
         System.out.println("here is your reverse right half pyramid");
         int rows=maxrows;
         while(rows >0){
             int i=0;
             while(i < rows){
                 System.out.print(" *");
                 i++;
             }
             System.out.println();
             rows--;
         }
     }

     public static void printrighthalfpyramid(int maxrows){
         System.out.println("here is your right half pyramid");
         int rows=0;
         while(rows< maxrows){
             System.out.print("* ");
             int i=0;
             while(i< rows){
                 System.out.print("* ");
                 i++;
             }
             System.out.println();
             rows++;
         }
     }
}
