import java.util.Scanner;

class SimpleInterestCalculator {

    public double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        SimpleInterestCalculator obj = new SimpleInterestCalculator();
        double si = obj.calculateSI(p, r, t);

        System.out.println("The Simple Interest is: " + si);

        sc.close();
    }
}