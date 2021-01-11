import java.util.Scanner;

public class tienlai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double lai = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tien gui: ");
        money = sc.nextDouble();
        System.out.println("Nhap thang gui: ");
        month = sc.nextInt();
        System.out.println("Nhap rate lai: ");
        lai = sc.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (lai/100)/12 * month;
        }
        System.out.println("Tong tien lai nhan: " + total);

    }
}
