public class NextDayCalculator {
    public static int[] nextDay(int day, int month, int year) {
        int[] date = new int[3];

        day ++;
        if (day > daysOfMonth(month, year)) {
            date[0] = 1;
            month++;
        } else {
            date[0] = day;
        }

        if (month > 12) {
            month = 1;
            year++;
        }

        date[1] = month;
        date[2] = year;

        return date;
    }

    public static int daysOfMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
