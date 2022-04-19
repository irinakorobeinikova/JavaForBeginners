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

    public static void verifyEquals(double expectedResult, double actualResult) {

        if (expectedResult ==actualResult) {
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


    // Task 4
    public static int returnSmallestValue(int a, int b, int c) {
        int small;

        if (a < b) {
            small = a;
        } else {
            small = b;
        }
        if (small > c) {
            small = c;
        }

        return small;
    }

    // Task 5
    public static double averageTempOfTheCat(double t1, double t2, double t3, double t4, double t5) {

        double averageTemp = (t1 + t2 + t3 + t4 + t5) / 5;

        return averageTemp;
    }

    // Task 6
    public static void printDollarsAndCents(double price) {
        int dollars = (int) price;
        double cents = price * 100 - dollars * 100;
        int cents1 = (int) cents;

        if (dollars < 10 && cents1 > 10) {
            System.out.println("0" + dollars + " dollars " + cents1 + " cents");
        } else if (dollars > 10 && cents1 < 10) {
            System.out.println(dollars + " dollars " + "0" + cents1 + " cents");
        } else if (dollars < 10 && cents1 < 10) {
            System.out.println("0" + dollars + " dollars " + "0" + cents1 + " cents");
        } else {
            System.out.println(dollars + " dollars " + cents1 + " cents");
        }
    }

    // Task 7
    public static void printKgAndGr(double weight) {
        int kg = (int) weight;
        double gr = weight * 1000 - kg * 1000;
        int gr1 = (int) gr;

        if (kg < 10 && gr1 > 10) {
            System.out.println("00" + kg + " kg " + gr1 + " gr");
        } else if (kg > 10 && gr1 < 10) {
            System.out.println(kg + " kg " + "00" + gr1 + " gr");
        } else if (kg < 10 && gr1 < 10) {
            System.out.println("00" + kg + " kg " + "00" + gr1 + " gr");
        } else if (kg < 100 && gr1 > 10) {
            System.out.println("0" + kg + " kg " + gr1 + " gr");
        } else if (kg > 10 && gr1 < 100) {
            System.out.println(kg + " kg " + "0" + gr1 + " gr");
        } else if (kg < 100 && gr1 < 100) {
            System.out.println("0" + kg + " kg " + "0" + gr1 + " gr");
        } else if (kg < 10 && gr1 < 100) {
            System.out.println("00" + kg + " kg " + "0" + gr1 +" gr");
        } else if (kg < 100 && gr1 < 100) {
            System.out.println("0" + kg + " kg " + "0" + gr1 + " gr");
        } else if (kg > 100 && gr1 < 100) {
            System.out.println(kg + " kg " + "0" + gr1 + " gr");
        } else if (kg < 100 && gr1 > 100) {
            System.out.println("0" + kg + " kg " + gr1 + " gr");
        } else {
            System.out.println(kg + " kg " + gr1 + " gr");
        }
    }


    public static void main(String[] args) {

        numberTask();
        /**2 Write a method that input a number from 1 to 7 and returns the day of the week.
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

        verifyEquals(48, returnLargeOfThree(12, 48,17));     // Test (1-th Method)
        verifyEquals(24, returnLargeWithMath(24, 5,11));     // Test (2-th Method)

        numberTask();
        /**4 Using nested if statements, write a fragment of code that prints the smallest value
         * contained in the variables a, b, c.
         */

        System.out.println(returnSmallestValue(5, 1, 29));

        verifyEquals(39, returnSmallestValue(42, 39, 58));     // Test
        verifyEquals(0, returnSmallestValue(2, 0, 23));     // Test

        numberTask();
        /**5 Write an algorithm for calculating the average value
         * of 5 indicators of the cat's body temperature.
         */

        System.out.println(averageTempOfTheCat(35.6, 37.2, 38.1, 36.2, 39.5));
        verifyEquals(37.32000000000001, averageTempOfTheCat(35.6, 37.2, 38.1, 36.2, 39.5));    // Test

        numberTask();
        /**6 Write a method that inputs a decimal number (for example, 10.75)
         *  and returns the string “10 dollars 75 cents”.
         */

        printDollarsAndCents(10.75);
        printDollarsAndCents(5.03);

        numberTask();
            /**7 Write a method that inputs a decimal number
             * and returns the string "10 kg 75 gr".
             */
            printKgAndGr(10.75);
            printKgAndGr(5.005);






    }
}
