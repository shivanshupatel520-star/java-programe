package loopsL7;

import java.util.Scanner;

public class sumofnumforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int num = 1; num<= n; num++){
            sum = sum +num;
        }
        System.out.println(sum);
    }
}

