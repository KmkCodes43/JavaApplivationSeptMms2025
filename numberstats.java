import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double sum     = 0;
        double product = 1;

        for (double num : numbers) {
            sum     += num;
            product *= num;
        }

        double average = sum / 5;

        System.out.println("\n===== Results =====");
        System.out.println("Sum:     " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);

        scanner.close();
    }
}