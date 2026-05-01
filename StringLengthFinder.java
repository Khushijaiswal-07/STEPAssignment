import java.util.Scanner;

class StringLengthFinder {

    // Method to find length using exception
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String text = sc.next();

            int manualLength = findLength(text);
            int actualLength = text.length();

            System.out.println("Manual Length: " + manualLength);
            System.out.println("Built-in Length: " + actualLength);

        } finally {
            sc.close();
        }
    }
}