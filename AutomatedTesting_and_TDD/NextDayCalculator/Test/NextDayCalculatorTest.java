import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class NextDayCalculatorTest {

    @Test
    void displayNextDay1 () {
       String inputdate = "1/1/2018";
       String expected = "2/1/2018";
       String result = NextDayCalculator.displayNextDay(inputdate);

       assertEquals(expected, result);
    }

    @Test
    void displayNextDay2 () {
       String inputdate = "31/1/2018";
       String expected = "1/2/2018";
       String result = NextDayCalculator.displayNextDay(inputdate);

       assertEquals(expected, result);
    }

    @Test
    void displayNextDay3 () {
       String inputdate = "30/4/2018";
       String expected = "1/5/2018";
       String result = NextDayCalculator.displayNextDay(inputdate);

       assertEquals(expected, result);
    }

    @Test
    void displayNextDay4 () {
        String inputdate = "28/2/2018";
        String expected = "1/3/2018";
        String result = NextDayCalculator.displayNextDay(inputdate);

       assertEquals(expected, result);
    }

    @Test
    void displayNextDay5 () {
        String inputdate = "29/2/2020";
        String expected = "1/3/2020";
        String result = NextDayCalculator.displayNextDay(inputdate);

       assertEquals(expected, result);
    }

    @Test
    void displayNextDay6 () {
        String inputdate = "31/12/2018";
        String expected = "1/1/2019";
        String result = NextDayCalculator.displayNextDay(inputdate);

       assertEquals(expected, result);
    }
}
