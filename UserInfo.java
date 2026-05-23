import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name:    ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age:     ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter your Address: ");
        String address = scanner.nextLine();

        System.out.println("\n=============================");
        System.out.println("       PERSONAL DETAILS      ");
        System.out.println("=============================");
        System.out.printf("  Name    : %s%n", name);
        System.out.printf("  Age     : %d years old%n", age);
        System.out.printf("  Address : %s%n", address);
        System.out.println("=============================");

        scanner.close();
    }
}