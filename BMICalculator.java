import java.util.Scanner;

class BMICalculator {

    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0;

            double bmi = weight / (heightMeters * heightMeters);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(data[i][1]); // height
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    public static void display(String[][] result) {
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[3][2]; // 3 persons for demo

        try {
            for (int i = 0; i < data.length; i++) {
                System.out.print("Enter weight (kg): ");
                data[i][0] = sc.nextDouble();

                System.out.print("Enter height (cm): ");
                data[i][1] = sc.nextDouble();
            }

            String[][] result = calculateBMI(data);
            display(result);

        } finally {
            sc.close();
        }
    }
}