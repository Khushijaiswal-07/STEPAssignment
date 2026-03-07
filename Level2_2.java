import java.util.Scanner;

class Level2_2 {

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        // Check if number is natural
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }

            // Print result
            System.out.println("Sum of numbers from 1 to " + number + " is " + sum);

        } else {
            System.out.println("The number is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}