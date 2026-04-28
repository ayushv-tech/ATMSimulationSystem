import java.util.*;

class ATM {
    Account acc = new Account();
    Scanner sc = new Scanner(System.in);

    void start() {
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (!acc.verifyPin(pin)) {
            System.out.println("Wrong PIN!");
            return;
        }

        while (true) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + acc.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double with = sc.nextDouble();
                    acc.withdraw(with);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}