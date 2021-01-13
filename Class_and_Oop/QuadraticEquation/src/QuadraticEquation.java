import java.util.Scanner;

public class QuadraticEquation {
    public double a, b, c;

    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getRoot1() {
        return (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    public double getDiscriminant() {
        return (this.b * 2) - (4 * this.a * this.c);
    }
}
class nhapvao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        QuadraticEquation number = new QuadraticEquation(a, b, c);
        double delta = number.getDiscriminant();
        if (delta > 0) {
            System.out.println("Nghiem thu 1: " + number.getRoot1());
            System.out.println("Nghiem thu 2: " + number.getRoot2());
        }else if (delta == 0) {
            System.out.println("Nghiem la : " + number.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

