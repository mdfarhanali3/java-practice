import java.util.Scanner;

public class ATM {

    public static int showBalance(int balance) {
        return balance;
    }

    public static int deposit(int balance, int amount) {
        return balance + amount;
    }

    public static int withdrawal(int balance, int amount) {
        return balance - amount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int currentBalance = 0;
        int choice;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Current Balance: ₹" 
                        + showBalance(currentBalance));

            } else if (choice == 2) {

                System.out.print("Enter deposit amount: ₹");
                int depositAmount = sc.nextInt();

                if (depositAmount > 0) {
                    currentBalance = deposit(currentBalance, depositAmount);
                    System.out.println("Deposit successful!");
                } else {
                    System.out.println("Invalid amount.");
                }

            } else if (choice == 3) {

                System.out.print("Enter withdrawal amount: ₹");
                int withdrawalAmount = sc.nextInt();

                if (withdrawalAmount > 0 && withdrawalAmount <= currentBalance) {
                    currentBalance = withdrawal(currentBalance, withdrawalAmount);
                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Insufficient balance or invalid amount.");
                }

            } else if (choice == 4) {

                System.out.println("Thank you for using the ATM!");
                break;

            } else {

                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}