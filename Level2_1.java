import java.util.Scanner;

class Level2_1 {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number > 0) {

            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {

                // Check if number is even
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                }
                // Otherwise it is odd
                else {
                    System.out.println(i + " is Odd");
                }
            }

        } else {
            System.out.println("The number is not a natural number");
        }

        // Close scanner
        input.close();
    }
}