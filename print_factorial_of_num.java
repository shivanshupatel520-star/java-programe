package loopsL7;

import java.util.Scanner;

public class print_factorial_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i =1; i <=n; i++){
            fact = fact * i ;
            System.out.println("fact of"+ i+"="+ fact);
        }
    }
}
