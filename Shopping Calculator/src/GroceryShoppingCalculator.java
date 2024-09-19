import java.util.Scanner;

public class GroceryShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for three items
        double[] prices = new double[3];
        int[] quantities = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter the price of item %d: ", i + 1);
            prices[i] = scanner.nextDouble();
            System.out.printf("Enter the quantity of item %d: ", i + 1);
            quantities[i] = scanner.nextInt();
        }

        // Calculate subtotal
        double subtotal = 0;
        for (int i = 0; i < 3; i++) {
            subtotal += prices[i] * quantities[i];
        }

        // Calculate discount, tax, and final total
        double discount = subtotal * 0.05;
        double discountedAmount = subtotal - discount;
        double salesTax = discountedAmount * 0.12;
        double finalTotal = discountedAmount + salesTax;

        // Display results
        System.out.printf("Subtotal: PHP %.2f\n", subtotal);
        System.out.printf("Discount: PHP %.2f\n", discount);
        System.out.printf("Sales Tax: PHP %.2f\n", salesTax);
        System.out.printf("Final Total: PHP %.2f\n", finalTotal);

        scanner.close();
    }
}