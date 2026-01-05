package basicsjava;

import java.util.Scanner;

public class gradesystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = input.nextInt();
        if(marks >=90){
            System.out.println("your grade is A");
        }else if (marks >= 65){
            System.out.println("you have got B");
        }else if(marks >=45){
            System.out.println("you have got C");
        }else{
            System.out.println("you are fail");
        }
    }
}
