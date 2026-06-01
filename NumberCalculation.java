import java.util.scanner
public class NumberCalculation
    public static void main(String[] args) {
        // Numbers 1 through 10
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // 1st, 5th, 10th -> indices 0, 4, 9
        int sumA = nums[0] + nums[4] + nums[9];
        
        // 3rd, 8th, 2nd -> indices 2, 7, 1
        int sumB = nums[2] + nums[7] + nums[1];
        
        // Product
        int product = sumA * sumB;
        
        // 4th, 7th, 6th, 9th -> indices 3, 6, 5, 8
        int sumC = nums[3] + nums[6] + nums[5] + nums[8];
        
        // Subtract product from sumC
        int result = sumC - product;
        
        // Check condition
        if (result >= 100) {
            System.out.println("hurray I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }
    }
}