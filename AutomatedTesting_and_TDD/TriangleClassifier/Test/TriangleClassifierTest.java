import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    void displayTypeTriangle1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giac deu";
        String result = TriangleClassifier.displayTypeTriangle(a,b,c);

        assertEquals(expected,result);

    }@Test
    void displayTypeTriangle2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giac can";
        String result = TriangleClassifier.displayTypeTriangle(a,b,c);

        assertEquals(expected,result);

    }@Test
    void displayTypeTriangle3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giac thuong";
        String result = TriangleClassifier.displayTypeTriangle(a,b,c);

        assertEquals(expected,result);

    }@Test
    void displayTypeTriangle4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Khong phai la tam giac";
        String result = TriangleClassifier.displayTypeTriangle(a,b,c);

        assertEquals(expected,result);

    }@Test
    void displayTypeTriangle5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Khong phai la tam giac";
        String result = TriangleClassifier.displayTypeTriangle(a,b,c);

        assertEquals(expected,result);

    }@Test
    void displayTypeTriangle6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Khong phai la tam giac";
        String result = TriangleClassifier.displayTypeTriangle(a,b,c);

        assertEquals(expected,result);
    }


}
