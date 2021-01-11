import java.util.Scanner;

public class sntnhohon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        /* gọi hàm checkPrimeNumber trong if với tham số truyền vào là các số bắt đầu từ 3 nhỏ hơn 100 qua vòng lặp để kiểm tra có là số nguyên tố.
         * +2 sau mỗi lần lặp để xác định số cần tìm là số lẻ.
         * hàm checkPrimeNumber trả về true or false.
         */

        for (int i = 3; i < n; i+=2) {
            if (checkPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    // hàm check các số nguyên tố
    public static boolean checkPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// nhập n = 100