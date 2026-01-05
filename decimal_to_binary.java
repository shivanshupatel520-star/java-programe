package loopsL7;

import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int decimal_number = sc.nextInt();
        int ans = 0;
        int pw = 1; //powers of 10
        while(decimal_number > 0){
            int parity = decimal_number % 2;
            ans = ans+ ( parity * pw);
            pw = pw * 10;
            decimal_number = decimal_number / 2;

        }
        System.out.println(ans);
    }
}
