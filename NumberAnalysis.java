import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 numbers
        int[] arr = new int[5];

        // Input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nChecking numbers:\n");

        // Processing each number
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                // Positive number
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            }
            else if (arr[i] < 0) {
                // Negative number
                System.out.println(arr[i] + " is Negative");
            }
            else {
                // Zero
                System.out.println(arr[i] + " is Zero");
            }
        }

        // Compare first and last elements
        System.out.println("\nComparing first and last elements:");

        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are Equal");
        }
        else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than last element");
        }
        else {
            System.out.println("First element is Less than last element");
        }

        sc.close();
    }
}