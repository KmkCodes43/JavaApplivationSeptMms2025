import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0;
        int item;

        System.out.println("Enter item number sold (1-4) or 0 to finish:");

        while (true) {
            System.out.print("Item: ");
            item = input.nextInt();
            if (item == 0) break;

            switch (item) {
                case 1: totalSales += 239.99; break;
                case 2: totalSales += 129.75; break;
                case 3: totalSales += 99.95; break;
                case 4: totalSales += 350.89; break;
                default: System.out.println("Invalid item number. Try again.");
            }
        }

        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Total earnings this week: $%.2f\n", earnings);
        input.close();
    }
}