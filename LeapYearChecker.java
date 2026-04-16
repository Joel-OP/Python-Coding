public class LeapYearChecker {

    public static void main(String[] args) {

        // Example usage with a few test cases:
        checkLeapYear(2000); // Leap year
        checkLeapYear(1900); // Not a leap year
        checkLeapYear(2024); // Leap year
        checkLeapYear(2023); // Not a leap year
        checkLeapYear(29);   // Not a leap year (based on FebDays, but also not a year)
    }

    public static void checkLeapYear(int year) {
        boolean isLeap = false;

        // A year is a leap year if it is divisible by 4,
        // except for end-of-century years, which must be divisible by 400.
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
