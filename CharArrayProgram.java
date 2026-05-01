import java.util.Scanner;

class CharArrayProgram {

    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String text = scanner.next();

            char[] manual = getCharacters(text);
            char[] builtin = text.toCharArray();

            System.out.println("Arrays equal: " + compareArrays(manual, builtin));

        } finally {
            scanner.close();
        }
    }
}