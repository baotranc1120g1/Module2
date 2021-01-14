public class Cylinder extends Circle {
    private double height = 6;
    private double volume;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        super.getArea();
        this.volume = this.area * this.height;
        return this.volume;
    }

    @Override
    public String toString() {
        return "Cylinder co: radius = " + this.radius + ", color = " + this.color + ", volume = " + this.volume;
    }
}