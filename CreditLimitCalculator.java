import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int account, startBalance, charges, credits, limit;

        System.out.print("Enter account number (-1 to end): ");
        account = input.nextInt();

        while (account != -1) {
            System.out.print("Beginning balance: ");
            startBalance = input.nextInt();
            System.out.print("Total charges: ");
            charges = input.nextInt();
            System.out.print("Total credits: ");
            credits = input.nextInt();
            System.out.print("Credit limit: ");
            limit = input.nextInt();

            int newBalance = startBalance + charges - credits;
            System.out.printf("New balance: %d\n", newBalance);

            if (newBalance > limit)
                System.out.println("Credit limit exceeded");

            System.out.print("\nEnter account number (-1 to end): ");
            account = input.nextInt();
        }
        input.close();
    }
}