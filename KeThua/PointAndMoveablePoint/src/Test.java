public class Test {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.println(point);

        Point point1 = new Point();
        point1.setXY(3,4);
        System.out.println(point1);

        MoveablePoint moveablePoint = new MoveablePoint(6,6);
        System.out.println(moveablePoint);

        MoveablePoint moveablePoint1 = new MoveablePoint();
        moveablePoint1.setSpeed(5,7);
        moveablePoint1.move();
        System.out.println(moveablePoint1);

        MoveablePoint moveablePoint2 = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint2);

    }
}
