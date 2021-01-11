import java.util.Scanner;

public class swapMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so USD: ");
        usd = sc.nextDouble();
        double swap = usd * vnd;
        System.out.print("So tien VND: " + swap);

    }
}
