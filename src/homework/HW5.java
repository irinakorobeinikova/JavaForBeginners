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

    public static void printLine() {

        System.out.println("******************************************************************************" + "\n");
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

        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(boolean expectedResult, boolean actualResult) {

        if (expectedResult == actualResult) {
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
            dayOfWeek = "Sunday";
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
            quantity1 = loaf + ",00";
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

    // Task 10.1
    public static String countSalary(double workHours, double payHours) {
        String salaryPerMonth = "";

        int salary = (int) (workHours * payHours * 21);
        double salary1 = workHours * payHours * 21;
        int coins = (int) (Math.floor((salary1 - salary) * 100));     // Method Math.floor(double a) or:
        // int coins = (int) ((salary1 - salary) * 100);
        salaryPerMonth = salary + " dollars " + coins + " cents";

        return salaryPerMonth;
    }

    // Task 11.1
    public static String returnMonth(int month) {

        if (month > 12 || month <= 0) {
            return "Wrong number of the month";
        }
        if (month == 1) {
            return "January";
        } else if (month == 2) {
            return "February";
        } else if (month == 3) {
            return "March";
        } else if (month == 4) {
            return "April";
        } else if (month == 5) {
            return "May";
        } else if (month == 6) {
            return "June";
        } else if (month == 7) {
            return "July";
        } else if (month == 8) {
            return "August";
        } else if (month == 9) {
            return "September";
        } else if (month == 10) {
            return "October";
        } else if (month == 11) {
            return "November";
        } else if (month == 12) {
            return "December";
        }

        return null;
    }

    // Task 11.2
    public static String nameEmploySalary(String name) {

        if (name == "Tom Smith") {
            return (name + "\t\t\t" + countSalary(8, 30));
        }
        if (name == "Sara Toner") {
            return (name + "\t\t\t " + countSalary(4, 25));
        }
        if (name == "Samanta Gilbert") {
            return (name +"\t\t\t" + countSalary(6, 35));
        }

        return "The name is not found";

    }

    // Task 11.3
    public static String payrollSheet(int month, String name) {

        return (returnMonth(month) + "\n" + nameEmploySalary(name) + "\n");
    }

    // Task 12
    public static String checkX(int x) {
        if (x < 0) {
            return x + ":" + " x is negative";
        } else if (x > 0) {
            return  x + ":" + " x is positive";
        } else {
            return x + ":" + " x is zero";
        }
    }

    // Task 13
    public static String luckyNumber(int year) {

        int digit1 = year / 1000;
        int digit2 = year / 100 % 10;
        int digit3 = year % 100 / 10;
        int digit4 = year % 10;
        int sumOfDigits = digit1 + digit2 + digit3 + digit4;

        if (sumOfDigits <= 9 && sumOfDigits >= 0) {
            return "Your lucky number is " + sumOfDigits;
        } else if (sumOfDigits > 9 && sumOfDigits <= 99) {
            int digit5 = sumOfDigits % 100 / 10;
            int digit6 = sumOfDigits % 10;
            int sumOfDigits1 = digit5 + digit6;
            if (sumOfDigits1 <= 9 && sumOfDigits1 >= 0) {
                return "Your lucky number is " + sumOfDigits1;
            } else if (sumOfDigits1 > 9 && sumOfDigits1 <= 99) {
                int digit7 = sumOfDigits1 % 100 / 10;
                int digit8 = sumOfDigits1 % 10;
                int sumOfDigits2 = digit7 + digit8;
                return "Your lucky number is " + sumOfDigits2;
            }
        }
        return null;
    }

    // Task 14.1
    public static String differAverageMedian(int a, int b, int c) {

        int average = (a + b + c) / 3;
        int median;
        String message = "";

        if ((a > b && a < c) || (a < b && a > c)) {
            median = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            median = b;
        } else {
            median = c;
        }

        int difference = average - median;

        if (difference < 0) {
            difference = difference * (-1);
        }

        if (difference > 2) {
            message = "The average value " + average + " differs from the median "
                    + median +  " by " + difference + ".";
        } else {
            message = "The average value = " + average + ", " + "median = " + median;
        }

        return message;
    }

    // Task 14.2
    public static String differAverageMedianMath(int a, int b, int c) {

        String message1 = "";
        int sum = a + b + c;
        int average1 = sum / 3;
        int minX = Math.min(Math.min(a, b), c);
        int maxX = Math.max(Math.max(a, b), c);
        int median1 = sum - minX - maxX;
        int difference1 = average1 - median1;
        Math.abs(difference1);

        if (difference1 > 2) {
            message1 = "The average value " + average1 + " differs from the median "
                    + median1 +  " by " + difference1 + ".";
        } else {
            message1 = "The average value = " + average1 + ", " + "median = " + median1;
        }

        return message1;
    }

    // Task 15.1
    public static String roundSumOfMoney(double s) {

        double returnMoney = Math.floor(s);
        String payment = "$" + returnMoney + "0";

        return payment;
    }

    //Task 16
    public static double solveExpression(double a, double b, double c) {
        double exponent = Math.pow(a, b);
        double sqrt = Math.sqrt(a);


        double result = (Math.sqrt((a * b + c) * exponent)) / Math.PI;

        return Math.ceil(result);
    }

    // Task 17.1
    public static int assignOne(int x, int y) {

        if (y > 0) {
            x = 1;
            System.out.println(x);
        }
        return x;
    }

    // Task 17.2
    public static double increaseFive(double score) {

        if (score >= 80 && score <= 90) {
            score += 5;
        }
        return score;
    }

    // Task 17.3
    public static boolean rewriteStatement(int i, int v) {
        boolean item = (i >= 10) || (v < 50);
        //boolean item = !((i < 10) || (v >= 50));
        return item;
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

        verifyEquals(countSalary(8, 40), "6720 dollars 0 cents");     // Test
        verifyEquals(countSalary(6.5, 23), "3139 dollars 50 cents");     // Test

        numberTask();
        /**11 Write a method that takes the necessary parameters as input
         * and prints a line of the payroll sheet for employees.
         */

        System.out.println(returnMonth(6));
        System.out.println(returnMonth(01));
        System.out.println(returnMonth(13));
        System.out.println(returnMonth(0));
        System.out.println(returnMonth(-2));
        printLine();

        System.out.println(nameEmploySalary("Tom Smith"));
        System.out.println(nameEmploySalary("Sara"));
        printLine();

        System.out.println(payrollSheet(2, "Samanta Gilbert"));
        System.out.println(payrollSheet(4, "Sara Toner"));
        System.out.println(payrollSheet(12, "Tom Smith"));

        numberTask();
        /**12 Write as a method the given scheme.
         *
         */

        System.out.println(checkX(25));
        System.out.println(checkX(-5));
        System.out.println(checkX(0));

        verifyEquals(checkX(25), "25: x is positive");
        verifyEquals(checkX(-5), "-5: x is negative");
        verifyEquals(checkX(0), "0: x is zero");

        numberTask();
        /**13 Write a method that takes a year of birth as input and returns your lucky number.
         * The lucky number is calculated by the formula: the sum of all numbers,
         * if the result is greater than 9,
         * sum all numbers again.
         */

        System.out.println(luckyNumber(1981));
        System.out.println(luckyNumber(2022));
        System.out.println(luckyNumber(2055));
        System.out.println(luckyNumber(9999));
        System.out.println(luckyNumber(999));
        System.out.println(luckyNumber(0));

        verifyEquals(luckyNumber(1981), "Your lucky number is 1");
        verifyEquals(luckyNumber(2022), "Your lucky number is 6");
        verifyEquals(luckyNumber(2055), "Your lucky number is 3");
        verifyEquals(luckyNumber(9999), "Your lucky number is 9");
        verifyEquals(luckyNumber(999), "Your lucky number is 9");
        verifyEquals(luckyNumber(0), "Your lucky number is 0");

        numberTask();
        /**14.1 3 numbers are given.
         * It is necessary to calculate the difference between the average value and the median value.
         * If the difference is greater than 2,
         * a message should be displayed: “The average value… differs from the median… by…”.
         * Otherwise, show the message: “The average value = …, median = …”
         */

            System.out.println(differAverageMedian(16, 9, 4));
            verifyEquals(differAverageMedian(16, 9, 4), "The average value = 9, median = 9");

         /**14.2 Calculate all the same using the methods of the Math class, where possible to use them/
          *
          */
            System.out.println(differAverageMedianMath(25, 3, 10));
            verifyEquals(differAverageMedian(25, 3, 10), "The average value = 12, median = 10");

          numberTask();
            /**15 Create a method using the Math class.
             * Input some amount of money (for example, 10.75) and round it in favor of the customer.
             * The method returns a new sum of money as a string, for example, “$10.00”.
             */

            System.out.println(roundSumOfMoney(10.75));
            verifyEquals(roundSumOfMoney(10.75), "$10.00");

            numberTask();
            /**16 Create a method using the Math class.
             * Return the value rounded up.
             */

            System.out.println(solveExpression(3, 4, 20));
            verifyEquals(solveExpression(3, 4, 20), 17.0);

            numberTask();
            /**17.1 Write a Java statement that assigns 1 to x if y is greater than 0.
             *
             */

            System.out.println(assignOne(3, 2));
            verifyEquals(assignOne(3, 2), 1);

            /**17.2 Suppose that score is a variable of type double.
             * Write the Java statement that increases the score by 5 marks
             * if score is between 80 and 90.
             */

            System.out.println(increaseFive(83.2));
            verifyEquals(increaseFive(83.2), 88.2);

            /**17.3 Rewrite in Java the following statement without using the NOT (!) operator:
             * item = ! ( (i < 10) || (v >= 50))
             */

            System.out.println(rewriteStatement(10, 50));
            verifyEquals(rewriteStatement(10,50), true);

            /**17.4 Write a Java statement that prints true if x is an odd number and positive.
             *
             */

            /**17.5 Write a Java statement that prints true if both x and y are positive numbers.
             *
             */

            /**17.6 Write a Java statement that prints true if x and y have the same sign (-/+).
             *
             */

            numberTask();
            /**18 Write a method that, using the methods of the Math class,
             * calculates any power of the generated random number.
             * The method returns a mathematically rounded integer value
             * and displays: “Number … to the power … = …”
             *
             * The number can be between 0 and 1 exclusively.
             * The degree of the number can be from 0 to 10 inclusive
             */

            numberTask();
            /**19 Write a method that returns a random number between 1 and 99 inclusive.
             *
             */

            numberTask();
//            /**20










        }

}
