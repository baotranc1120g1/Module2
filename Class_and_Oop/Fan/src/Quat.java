public class Quat {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeedFast();
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.turnOn();
        System.out.println(Fan1.toString());
        Fan Fan2 = new Fan();
        Fan2.setSpeedMedium();
        Fan2.setRadius(5);
        Fan2.setColor("blue");
        Fan2.turnOff();
        System.out.println(Fan2.toString());
    }
}
class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan () {}

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeedSlow() {
        this.speed = SLOW;
    }
    public void setSpeedMedium() {
        this.speed = MEDIUM;
    }
    public void setSpeedFast() {
        this.speed = FAST;
    }
    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        this.on = true;
    }
    public void turnOff() {
        this.on = false;
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
    public String toString() {
        if (this.on)
            return "Fan is on: Speed = " + this.speed + "," + " Color = " + this.color + "," + " Radius = " + this.radius;
        else
            return "Fan is off: Color = " + this.color + "," + " Radius = " + this.radius;
    }
}
