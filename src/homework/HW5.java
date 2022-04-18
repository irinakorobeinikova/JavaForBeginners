package homework;

public class HW5 {

    public static int number = 2;

    public static void numberTask() {

        System.out.println();
        System.out.println("\u001B[33m" + "**************************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "**************************" + "\u001B[0m");

        number++;
        System.out.println();
    }

    //Task 2
    public static void verifyEquals(int expectedResult, int actualResult) {

        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(String expectedResult, String actualResult) {

        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    //Task 3
    public static String returnDayOfWeek(int num1) {

        String dayOfWeek = "";

        if (num1 <= 0 || num1 > 7) {
            dayOfWeek = "Input the right number from 1 to 7";
        }
        if (num1 == 1) {
            dayOfWeek = "Monday";
        } else if (num1 == 2) {
            dayOfWeek = "Tuesday";
        } else if (num1 == 3) {
            dayOfWeek = "Wednesday";
        } else if (num1 == 4) {
            dayOfWeek = "Thursday";
        } else if (num1 == 5) {
            dayOfWeek = "Friday";
        } else if (num1 == 6) {
            dayOfWeek = "Saturday";
        } else if (num1 == 7) {
            dayOfWeek ="Sunday";
        }
        return dayOfWeek;
    }

    // Task 3 (1 version)
    public static int returnLargeOfThree(int x, int y, int z) {

        int large;

        if (x > y) {
            large = x;
        } else {
            large = y;
        }
        if (large < z) {
            large = z;
        }

        return large;
    }

    // Task 3 (2 version)
    public static int returnLargeWithMath(int x, int y, int z) {

        int max1 = Math.max(Math.max(x, y), z);

        return max1;
    }

    public static void main(String[] args) {

        numberTask();
        /**2 Write a method that takes a number from 1 to 7 as input and returns the day of the week.
         *
         */

//        returnDayOfWeek(9);
//        returnDayOfWeek(4);
//        returnDayOfWeek(1);

        verifyEquals("Sunday", returnDayOfWeek(7));
        verifyEquals("Monday", returnDayOfWeek(1));
        verifyEquals("Input the right number from 1 to 7", returnDayOfWeek(8));
        verifyEquals("Input the right number from 1 to 7", returnDayOfWeek(0));

        numberTask();
        /**3 Given three numbers, x, y, z.
         * Determine the largest value and assign this value to the variable largest.
         */

        int x = 15;
        int y = 8;
        int z = 35;

        System.out.println(returnLargeOfThree(x, y, z));     // 1-th Method
        System.out.println(returnLargeWithMath(x, y, z));    // 2-th Method







    }
}
