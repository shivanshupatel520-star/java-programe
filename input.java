package basicsjava;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tell me your name");
        String name = input.nextLine();
        System.out.println("welcome"+ name);
    }
}
