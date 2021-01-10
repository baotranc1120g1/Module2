import java.util.Scanner;

public class giaiptbn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
            if (a != 0) {
                double answer = (c - b) / a;
                System.out.printf("Equation pass with x = %f!\n", answer);
            } else {
                if (b == 0) {
                    System.out.print("The solution is all x!");
                } else {
                    System.out.print("No solution!");
                }
            }

        }
    }
}
