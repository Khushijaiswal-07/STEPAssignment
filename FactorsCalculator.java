import java.util.Scanner;

class FactorsCalculator {

    public int[] getFactors(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    public int product(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++)
            prod *= arr[i];
        return prod;
    }

    public double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += Math.pow(arr[i], 2);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        FactorsCalculator obj = new FactorsCalculator();

        int[] factors = obj.getFactors(n);

        System.out.println("Factors:");
        for (int i = 0; i < factors.length; i++)
            System.out.print(factors[i] + " ");

        System.out.println("\nSum = " + obj.sum(factors));
        System.out.println("Product = " + obj.product(factors));
        System.out.println("Sum of Squares = " + obj.sumOfSquares(factors));

        sc.close();
    }
}