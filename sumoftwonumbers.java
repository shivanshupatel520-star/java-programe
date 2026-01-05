import java.util.Scanner;

public class sumoftwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        int num1= sc.nextInt();

        System.out.println("enter your second number");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("sum:"+sum);

    }
}
