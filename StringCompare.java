import java.util.Scanner;

class StringCompare {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first string: ");
            String str1 = scanner.next();

            System.out.print("Enter second string: ");
            String str2 = scanner.next();

            boolean result1 = compareStrings(str1, str2);
            boolean result2 = str1.equals(str2);

            System.out.println("Using charAt(): " + result1);
            System.out.println("Using equals(): " + result2);

        } finally {
            scanner.close();
        }
    }
}