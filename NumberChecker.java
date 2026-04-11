class NumberChecker {

    public static int countDigits(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static int[] getDigits(int n, int count) {

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }

    public static boolean isDuck(int[] digits) {

        for (int d : digits)
            if (d == 0)
                return true;

        return false;
    }

    public static boolean isArmstrong(int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int d : digits)
            sum += Math.pow(d, power);

        int number = 0;
        for (int d : digits)
            number = number * 10 + d;

        return sum == number;
    }

    public static void main(String[] args) {

        int number = 153;

        int count = countDigits(number);
        int[] digits = getDigits(number, count);

        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(digits));
    }
}