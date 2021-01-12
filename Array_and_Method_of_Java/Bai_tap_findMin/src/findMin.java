import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap vao size: ");
            size = scanner.nextInt();

        } while (false);
        int array[] = new int[size];

        System.out.println("Nhap gia tri cua mang: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu: " + (i+1));
            array[i] = scanner.nextInt();
        }
        int min = minvalue(array);
        System.out.println("Min la : "+ min);

    }

    public static int minvalue(int[] array) {
        int m = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < m) {
                m = array[j];
            }
        }
        return m;
    }
}
