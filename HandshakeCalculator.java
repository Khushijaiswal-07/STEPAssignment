import java.util.Scanner;

class HandshakeCalculator {

    public int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        HandshakeCalculator obj = new HandshakeCalculator();
        int result = obj.calculateHandshakes(n);

        System.out.println("Maximum number of handshakes = " + result);

        sc.close();
    }
}