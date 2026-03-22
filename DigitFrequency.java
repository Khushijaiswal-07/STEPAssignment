import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;

        // Step 1: Count digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Step 3: Frequency array (0–9)
        int[] freq = new int[10];

        // Step 4: Calculate frequency
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            freq[digit]++;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}