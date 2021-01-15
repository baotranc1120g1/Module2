public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D);

        Point2D point2D1 = new Point2D();
        point2D1.setXY(2,3);
        System.out.println(point2D1);

        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);

        Point3D point3D1 = new Point3D();
        point3D1.setXYZ(4,2,0);
        System.out.println(point3D1);
    }
}
