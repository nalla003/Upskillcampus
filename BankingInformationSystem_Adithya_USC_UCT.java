import java.util.Scanner;

public class BankingInformationSystem {

    static class BankAccount {
        String accountNumber;
        String accountHolderName;
        double balance;

        // Constructor
        BankAccount(String accNumber, String accHolderName, double initialBalance) {
            accountNumber = accNumber;
            accountHolderName = accHolderName;
            balance = initialBalance;
        }

        // Method to deposit money
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit successful.");
        }

        // Method to withdraw money
        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        // Method to check balance
        void checkBalance() {
            System.out.println("Current Balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking Information System!");

        // Creating a bank account
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.00);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
