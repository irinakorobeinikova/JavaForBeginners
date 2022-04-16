package lessons;

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




    }
}
