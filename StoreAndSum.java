import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of max 10 elements
        double[] numbers = new double[10];

        double total = 0.0;
        int index = 0;

        // Infinite loop for input
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Stop condition
            if (input <= 0) {
                break;
            }

            // Check array limit
            if (index == 10) {
                break;
            }

            // Store value and increment index
            numbers[index] = input;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nNumbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display total
        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}