import java.util.Scanner;

class SubstringProgram {

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String text = scanner.next();

            System.out.print("Enter start index: ");
            int start = scanner.nextInt();

            System.out.print("Enter end index: ");
            int end = scanner.nextInt();

            String manual = createSubstring(text, start, end);
            String builtin = text.substring(start, end);

            System.out.println("Manual substring: " + manual);
            System.out.println("Built-in substring: " + builtin);
            System.out.println("Are equal: " + compareStrings(manual, builtin));

        } finally {
            scanner.close();
        }
    }
}