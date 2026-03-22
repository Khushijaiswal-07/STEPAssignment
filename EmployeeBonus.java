import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays for 10 employees
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input loop
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            years[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // repeat this employee
                continue;
            }
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5%
            } else {
                bonus[i] = salary[i] * 0.02; // 2%
            }

            newSalary[i] = salary[i] + bonus[i];

            // Totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Employee Details ---");

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n--- Company Summary (Zara) ---");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}