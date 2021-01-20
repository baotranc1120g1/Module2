public class TriangleClassifier {

    public static String displayTypeTriangle(int a, int b, int c) {
        String typeTriangle;
        if ((a > 0) && (c > 0) && (b > 0) && ((a + b > c) && (b + c > a) && (a + c > b))) {
            typeTriangle = "Tam giac thuong";

            if ((a == b) && (a == c) && (b == c)) {
                typeTriangle = "Tam giac deu";

            } else if ((a == b) || (b == c) || (a == c)) {
                typeTriangle = "Tam giac can";

            }

        }
        else {
            typeTriangle = "Khong phai la tam giac";
        }
        return typeTriangle;
    }
}




