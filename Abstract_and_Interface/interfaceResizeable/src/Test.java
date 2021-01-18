
public class Test {
    public static void main(String[] args) {
        double percent;
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        System.out.println("Ban dau Circle Area = " + circle.getArea());
        percent = Math.random();
        circle.resize(percent);
        System.out.println("After Circle Area = " + circle.getArea());

        System.out.println("Ban dau Rectangle Area = " + rectangle.getArea());
        percent = Math.random();
        rectangle.resize(percent);
        System.out.println("After Rectangle Area = " + rectangle.getArea());

        System.out.println("Ban dau Square Area = " + (square.getWidth() * square.getLength()));
        percent = Math.random();
        square.resize(percent);
        System.out.println("After Square Area = " + (square.getWidth() * square.getLength()));

    }
}
