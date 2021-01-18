import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCricle[] circles = new ComparableCricle[][ 3];
        circles[0] = new ComparableCricle(3.6);
        circles[1] = new ComparableCricle();
        circles[2] = new ComparableCricle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCricle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCricle circle : circles) {
            System.out.println(circle);
        }
    }
}
