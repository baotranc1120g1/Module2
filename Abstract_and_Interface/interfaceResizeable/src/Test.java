
public class Test {
    public static void main(String[] args) {
        double percent;
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        System.out.println("Ban dau Circle width = " + circle.getRadius());
        percent = Math.random();
        circle.resize(percent);
        System.out.println("After Circle width = " + circle.getRadius());


        System.out.println("Ban dau Rectangle width: " + rectangle.getWidth() + "/" + "length" + rectangle.getLength());
        percent = Math.random();
        rectangle.resize(percent);
        System.out.println("After Rectangle width = " + rectangle.getWidth() + "/" + "length = " + rectangle.getLength());


        System.out.println("Ban dau Square width: " + square.getWidth() + "/" + "length" + square.getLength());
        percent = Math.random();
        square.resize(percent);
        System.out.println("After Square width = " + square.getWidth() + "/" + "length = " + square.getLength());
    }
}
