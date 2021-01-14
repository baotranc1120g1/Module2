public class kiemtra {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(3);
        circle1.setColor("Black");
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(2, "Red");
        System.out.println(circle2.getArea());
        System.out.println(circle2.toString());

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setRadius(1);
        cylinder1.setHeight(4);
        System.out.println(cylinder1.toString());

        Cylinder cylinder2 = new Cylinder(5, 6, "Green");
        System.out.println(cylinder2.getVolume());
        System.out.println(cylinder2.toString());
    }
}

