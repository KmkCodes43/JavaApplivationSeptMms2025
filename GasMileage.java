import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0, totalGallons = 0;
        int miles, gallons;

        System.out.println("Enter miles driven and gallons used (negative to stop):");

        while (true) {
            System.out.print("Miles: ");
            miles = input.nextInt();
            if (miles < 0) break;

            System.out.print("Gallons: ");
            gallons = input.nextInt();
            if (gallons < 0) break;

            double mpg = (double) miles / gallons;
            System.out.printf("This trip MPG: %.2f\n", mpg);

            totalMiles += miles;
            totalGallons += gallons;
            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined MPG so far: %.2f\n\n", combinedMpg);
        }
        input.close();
    }
}