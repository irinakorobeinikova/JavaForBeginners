package lessons.lesons1to7;

public class Lesson5 {

    public static int returnMinOfThree(int a, int b, int c) {     // Method (Task #1)

        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    public static double average(int a, int b, int c) {

        return ((double)a + b +c) / 3;
    }

    public static double returnAbc(double number) {
        if (number < 0) {
            number = (-1) * number;
        }

        return number;
    }

    public static double countOfDifferenceBetweenMinAndAverage(int a, int b, int c) {
        int min = returnMinOfThree(a, b, c);
        double average = average(a, b, c);

        return returnAbc(min - average);
    }

    public static String displayMessage(int a, int b, int c) {

        String message;

        if (countOfDifferenceBetweenMinAndAverage(a, b, c) > 3.51) {
            message = "Big spread of numbers";
            System.out.println(message);
        } else {
            message = "Small spread of numbers";
            System.out.println(message);
        }

        return message;
    }

    public static void main(String[] args) {

        /**1 Given 3 numbers.
         * Need to find the most accurate difference
         * between the minimum number and the average value.
         * If the difference is greater than 3.51,
         * show the user the message "Big spread of numbers",
         * otherwise show the message "Small spread of numbers"
         */

        int a = 5;
        int b = 2;
        int c = 10;

        System.out.println(returnMinOfThree(a, b, c));
        System.out.println(average(a, b, c));
        displayMessage(a, b, c);
    }
}
