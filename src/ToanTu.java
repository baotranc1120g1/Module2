import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao");
        height = scanner.nextFloat();
        System.out.println("Nhap chieu rong");
        width = scanner.nextFloat();
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
