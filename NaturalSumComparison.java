import java.util.Scanner;

class NaturalSumComparison {

    public int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    public int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        NaturalSumComparison obj = new NaturalSumComparison();

        int r1 = obj.recursiveSum(n);
        int r2 = obj.formulaSum(n);

        System.out.println("Recursive Sum = " + r1);
        System.out.println("Formula Sum = " + r2);

        if (r1 == r2)
            System.out.println("Both results are equal");
        else
            System.out.println("Results are different");

        sc.close();
    }
}