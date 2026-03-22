import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0 && index < maxDigit) {
            int digit = number % 10;   // get last digit
            digits[index] = digit;    // store in array
            index++;
            number = number / 10;     // remove last digit
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output
        System.out.println("\nDigits stored:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second Largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }

        sc.close();
    }
}