package loopsL7;

import java.util.Scanner;

class ATM {
    double balance;

    // constructor to set initial balance
    ATM(double initialBalance) {
        balance = initialBalance;
    }

    // method to check balance
    void checkBalance() {
        System.out.println("Your current balance: ₹" + balance);
    }

    // method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // method to withdraw money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully!");
        }
    }
}

class MiniATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM myATM = new ATM(1000.0); // starting balance

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    myATM.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    myATM.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    myATM.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM! 👋");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
