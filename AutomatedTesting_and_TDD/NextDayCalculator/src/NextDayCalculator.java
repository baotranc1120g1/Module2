public class NextDayCalculator {

    public static String displayNextDay(String inputdate) {
        String[] elements = inputdate.split("/");
        String oldDay = elements[0];
        int day = Integer.parseInt(oldDay);
        String oldMonth = elements[1];
        int month = Integer.parseInt(oldMonth);
        String oldYear = elements[2];
        int year = Integer.parseInt(oldYear);

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month += 1;
                } else {
                    day += 1;
                }
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year += 1;
                } else {
                    day += 1;
                    month += 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month += 1;
                } else {
                    day += 1;
                }
                break;
            case 2:
                boolean isLeapYear = checkLeapYear(year);
                if (isLeapYear) {
                    if (day == 29) {
                        day = 1;
                        month = 3;
                    } else {
                        day += 1;
                    }
                } else {
                    if (day == 28) {
                        day = 1;
                        month = 3;
                    } else {
                        day += 1;
                    }
                }
                break;
        }
        return day + "/" + month + "/" + year;
    }
        public static boolean checkLeapYear(int year) {
            boolean isLeapYear = false;
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                isLeapYear = true;
            }
            return isLeapYear;
        }
}

