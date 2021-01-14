public class Circle {
    protected double radius = 6;
    protected String color = "Blue";
    protected double area;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        this.area = this.radius * this.radius * Math.PI;
        return this.area;
    }

    @Override
    public String toString() {
        return "Cirlce co: radius = " + this.radius + ", color = " + this.color + ", area = " + this.area;
    }
}
