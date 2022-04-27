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
            System.out.println(((double) i/10) + " ");
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







    }
}
