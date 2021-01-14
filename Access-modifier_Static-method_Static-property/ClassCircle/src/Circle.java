public class Circle {
    private double radius = 1.0;

    private String color = "red";

    public Circle () {
    }

    public Circle (double radius) {

    }

    private double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getRadius();
        circle.getArea();
    }
}
