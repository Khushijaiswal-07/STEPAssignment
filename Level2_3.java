import java.util.Scanner;

class Level2_3 {

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is natural
        if (number > 0) {

            // Loop from 1 to 10
            for (int i = 1; i <= 10; i++) {

                // Print multiplication result
                System.out.println(number + " x " + i + " = " + (number * i));
            }

        } else {
            System.out.println("The number is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}