import java.util.Scanner;

public class xoapt {
    public static void main(String[] args) {
        int N;
        int i, index;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            N = scanner.nextInt();
        } while (N <= 0);

        int array[] = new int[N];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < N; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên X: ");
        int X = scanner.nextInt();
        boolean check = false;
        for (i = 0; i<array.length; i++) {
            if (X == array[i]) {
                System.out.println("Phần tử có trong mảng tại vị trí" + i);
                check = true;
                break;
            }
        } if (check == false)
            System.out.println("Không có phần tử " + X + "trong mảng");

        for (index = i = 0; i < N; i++) {
            if (array[i] != X) {
                array[index] = array[i];
                index++;
            }
        }

        N = index;

        System.out.println("Mảng còn lại sau khi xóa phần tử " + X + " là: ");
        for (i = 0; i < N; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}

