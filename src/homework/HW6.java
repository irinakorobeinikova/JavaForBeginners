package homework;

public class HW6 {

    public static int number = 1;

    public static void numberTask() {

        System.out.println();
        System.out.println("\u001B[33m" + "**************************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "**************************" + "\u001B[0m");

        number++;
        System.out.println();
    }

    // Task 10
    public static void seq10(double start, double end, double step) {
        //increasing start < end, step > 0
        //decreasing start > end, step < 0
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    // Task 11
    public static void task11(int l) {
        for(int i = 0; i <= l; i += 2){
            System.out.println(i);
        }
    }

    // Task 12
    public static void  task12(int n) {
        for (int i = 1; i <= n; i ++) {
            System.out.println(String.format("%2.0f", Math.pow(2, i)));
        }
    }

    // Task 13
    public static void task13() {
       String result = "";
       String result2 = "";
       String result3 = "";
       String result4 = "";
       for (int i = 0; i < 10; i++) {
           result = result + i;
           result2 = result2 + i + i;
           result3 = result3 + i + i + i;
           result4 = result4 + i + i + i + i;
       }
        System.out.println(result + result2 + result3 + result4);
    }

    // Task 16
    public static void task16(double n, double m, double l) {

        if (n < m && l > 0) {
            for (n = n; n < m; n += l) {
                if (n % 2 != 0) {
                    System.out.println(n);
                }
            }
        } else if (n > m && l < 0) {
            for (n = n; n > m; n += l) {
                if (n % 2 != 0) {
                    System.out.println(n);
                }
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    // Task 17
    public static void seq17(int n) {
        int l = n + 10;
        for ( ; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }
    }





    public static void main(String[] args) {

        numberTask();
        /**1 Print a sequence of numbers from 0 to 9 inclusive.
         *
         */

        for (int i = 1; i < 10; i ++) {
            System.out.println(i);
        }

        numberTask();
        /**2 Print a sequence of numbers from 10 exclusively to 0 inclusive.
         *
         */

        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }

        numberTask();
        /**3 Print a sequence of numbers from 50 to 55 inclusive,
         *  with step 2.
         */

        for (int i = 50; i <= 55; i += 2) {
            System.out.println(i);
        }

        numberTask();
        /**4 Print a sequence of multiples of 7 between (327, 300)
         *
         */

        for (int i = 326; i > 300; i--) {

            if (i % 7 == 0) {
                System.out.println(i + " ");
            }
        }

        numberTask();
        /**5 Print a sequence of numbers in the interval [12, 13]
         * with a step of 0.1
         */

        for (double i = 120; i < 131; i++) {
            System.out.print(((double) i/10) + " ");
        }

        numberTask();
        /**6 Print a sequence of even numbers from 215 to 237 inclusive
         *
         */

        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        numberTask();
        /**7 Print a sequence of multiples of 7 ranging
         * from 7 exclusively to 14 exclusively.
         */

        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        numberTask();
        /**8 Print a sequence that starts with the minimum value of the data type short
         * and ends with the maximum value of short.
         * The numbers in the sequence must be a multiple of 15001.
         */

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }

        }

        numberTask();
        /**9 Print a sequence of numbers between -10 and 34 inclusive.
         * Numbers divisible by 11 must be printed in blue.
         * Numbers divisible by 12 should be printed in red.
         * And zero must be printed with the word ZERO.
         */

        for (int i = -10; i < 35; i++) {

            if (i == 0) {
                System.out.println("ZERO");
            } else if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            }
        }

        numberTask();
        /**10 Write a method that accepts "start", "end", "step" parameters as input
         * and prints a sequence of decimal numbers, starting from "start",
         * where step is "step".
         * The loop exit point is the number "end"/
         */

        //happy path
        seq10(10.5, 20.75, 1.29);
        System.out.println("---------------------------------------");
        seq10(15.9, 0, -1.45);
        System.out.println("---------------------------------------");

        //negative
        seq10(15.9, 0, 0);
        System.out.println("---------------------------------------");
        seq10(15.9, 0, 1);
        System.out.println("---------------------------------------");
        seq10(-15.9, 0, -1);
        System.out.println("---------------------------------------");
        seq10(0, 0, 1);
        System.out.println("---------------------------------------");
        seq10(0, 0, -1);

        numberTask();
        /**11 Write a method that takes a parameter l
         * and prints a sequence of even numbers from zero.
         * Sequence length = l.
         */

        task11(10);

        numberTask();
        /**12 Write a method that takes an integer n
         * and prints all degrees of 2 from 1 to n inclusive.
         */

        task12(8);

        numberTask();
        /**13 Output the sequence 012345678900112233445566778899000…
         * up to and including the number 9999.
         */

        task13();

        numberTask();
        /**14 Print out a sequence of numbers:
         * 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         */
        System.out.print(0);
        for (int y = 1; y < 6; y++) {
            System.out.print(", " + y + ", " + y * (-1));
        }

        numberTask();
        /**15 Print a sequence of numbers:
         * 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
         */

        System.out.print(0);
        for (int i = 1; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(", " + i);
            }
        }

        numberTask();
        /**16 Write a method that takes parameters n, m, l,
         * and prints a sequence of odd numbers starting from number n,
         * with step l,
         * the length of the sequence is m.
         */

        //happy path
        task16(10.2, 25.3, 3.4);
        System.out.println("---------------------------------------");
        task16(14.1, 0, -1.5);
        System.out.println("---------------------------------------");

        //negative
        task16(17.3, 0, 0);
        System.out.println("---------------------------------------");
        task16(17.3, 0, 1);
        System.out.println("---------------------------------------");
        task16(-17.3, 0, -1);
        System.out.println("---------------------------------------");
        task16(0, 0, 1);
        System.out.println("---------------------------------------");
        task16(0, 0, -1);

        numberTask();
        /**17 Generate and print out a sequence using the formula:
         * n + 1 = n + 2
         */

        seq17(1);
        System.out.println("---------------------------------------");
        seq17(2);
        System.out.println("---------------------------------------");
        seq17(3);

























    }
}
