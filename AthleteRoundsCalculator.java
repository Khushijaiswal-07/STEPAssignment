import java.util.Scanner;

class AthleteRoundsCalculator {

    public double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        AthleteRoundsCalculator obj = new AthleteRoundsCalculator();
        double rounds = obj.calculateRounds(a, b, c);

        System.out.println("Number of rounds to complete 5km = " + rounds);

        sc.close();
    }
}