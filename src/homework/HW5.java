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
    public static String printDollarsAndCents(double price) {
        String DollarsAndCents = "";

        int dollars = (int) price;
        double cents = price * 100 - dollars * 100;
        int cents1 = (int) cents;

        if (dollars >= 0 && cents1 < 10) {
            DollarsAndCents = "$" + dollars + "." + "0" + cents1;
        } else {
            DollarsAndCents = "$" + dollars + "." + cents1;
        }

        return DollarsAndCents;
    }

    // Task 7.1
    public static String printKgAndGr(double weight) {
        String KgAndGr = "";

        int kg = (int) weight;
        double gr = weight * 1000 - kg * 1000;
        int gr1 = (int) gr;

        if (kg >= 0 && gr1 < 10) {
            KgAndGr = kg + " kg " + "00" + gr1 + " g";
        } else if (kg >= 0 && gr1 < 100) {
            KgAndGr = kg + " kg " + "0" + gr1 + " g";
        } else {
            KgAndGr = kg + " kg " + gr1 + " g";
        }

        return KgAndGr;
    }

    // Task 7.2
    public static String printQuantity(double quantity) {
        String quantity1 = "";

        int loaf = (int) quantity;

        if (loaf >= 1) {
            quantity1 = loaf +",00";
        }

        return quantity1;
    }

    // Task 8
    public static String sumOfPurchase(double price, double weight) {

        double sum = price * weight;

        return printDollarsAndCents(sum);
    }

    // Task 9.1
    public static void printReceipt(String goods, double price, double weight) {

        double sum = price * weight;
        String priceCheck = "Price per 1 kg";
        String priceSum = printDollarsAndCents(price);
        String weightCheck = "Weight";
        String weightSum = printKgAndGr(weight);
        String printLine = "_______________________________________";
        String total = "Total ";
        String receiptTotal = printDollarsAndCents(sum);

        System.out.println(goods);
        System.out.println(priceCheck + "          " + priceSum);
        System.out.println(weightCheck + "             " + weightSum);
        System.out.println(printLine);
        System.out.println(total + "                 " + receiptTotal);
        System.out.println();

    }

    // Task 9.2
    public static void printReceiptBread(String goods, double price, double quantity) {

        double sum1 = price * quantity;
        String priceCheck1 = "Price per 1 item";
        String priceSum1 = printDollarsAndCents(price);
        String weightCheck1 = "Quantity";
        String weightSum1 = printQuantity(quantity);
        String printLine1 = "_______________________________________";
        String total1 = "Total ";
        String receiptTotal1 = printDollarsAndCents(sum1);

        System.out.println(goods);
        System.out.println(priceCheck1 + "        " + priceSum1);
        System.out.println(weightCheck1 + "                 " + weightSum1);
        System.out.println(printLine1);
        System.out.println(total1 + "                 " + receiptTotal1);
        System.out.println();

    }

    // Task 10
    public static String countSalary(double workHours, double payHours) {
        String salaryPerMonth = "";

        int salary = (int) (workHours * payHours * 21);
        double salary1 = workHours * payHours * 21;
        int coins = (int) ((salary1 - salary) * 100);
        salaryPerMonth = salary + " dollars " + coins + " cents";

        return salaryPerMonth;
    }


    public static void main(String[] args) {

        numberTask();
        /**2 Write a method that input a number from 1 to 7 and returns the day of the week.
         *
         */

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
         *  and returns the string "$10.75".
         */

        System.out.println(printDollarsAndCents(10.75));
        System.out.println(printDollarsAndCents(5.03));
        verifyEquals(printDollarsAndCents(10.75), "$10.75");     // Test
        verifyEquals(printDollarsAndCents(5.03), "$5.03");     // Test

        numberTask();
        /**7 Write a method that inputs a decimal number
         * and returns the string "10 kg 75 g".
         */

        System.out.println(printKgAndGr(10.75));
        System.out.println(printKgAndGr(5.005));
        verifyEquals(printKgAndGr(10.75), "010 kg 750 g" );     // Test
        verifyEquals(printKgAndGr(5.005), "005 kg 005 g" );     // Test

        numberTask();
        /**8 Write a method that inputs 2 parameters - the price and the quantity of the goods
         * (it may be the weight of the goods, or the quantity in pieces).
         * Algorithm for the sum of purchases as the decimal numbers.
         */

        System.out.println(sumOfPurchase(102.2, 3.2));
        System.out.println(sumOfPurchase(25.20, 2.3));
        verifyEquals(sumOfPurchase(102.2, 3.2), "$327.04");     // Test
        verifyEquals(sumOfPurchase(25.2, 2.3), "$57.95");     //Test

        numberTask();
        /**9 Write a method that accepts certain inputs and prints out a receipt.
         * For example:
         * Apples
         * Price per 1 kg		     $5.13
         * Weight           	3 kg 400 g
         * _______________________________________
         * Total		            $17.44
         * or
         * Bread
         * Price per 1 loaf		     $3.50
         * Quantity           	      5.00
         * _______________________________________
         * Total		            $17.50
         */

        printReceipt("Apples",5.13, 3.400);
        printReceiptBread("Bread", 3.5, 5);

        numberTask();
        /**10 Write a method that takes as input the number of hours of work per day and the cost of one hour of work,
         * and returns the salary per month.
         */

        System.out.println(countSalary(8, 40));
        System.out.println(countSalary(6.5, 23));




    }
}
