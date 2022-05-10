package lessons.lesons1to7;

public class Lesson6 {

    public static int number = 1;

    public static void numberTask() {

        System.out.println();
        System.out.println("\u001B[33m" + "**************************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "**************************" + "\u001B[0m");

        number++;
        System.out.println();
    }

    public static void main(String[] args) {

//        for(; ;) {
//
//        }
        /**1 Print "Java for beginners" for all numbers from 1 to 5 inclusive.
         *
         */
        numberTask();

        for(int i = 1; i < 6; i++) {
            System.out.println("Java for beginners");
        }

        /**2 Print all numbers from 1 to 5 inclusive.
         *
         */
        numberTask();

        for(int i = 1; i < 6; i++) {
             System.out.println(i);
        }

        /**2 Print all numbers from 1 to 5 inclusive.
         *
         */
        numberTask();

        for(int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        /**3 Print only odd numbers from 1 to 10 inclusive.
         *
         */
        numberTask();

        for (int i = 1; i < 11; i += 2) {
                System.out.println(i);
        }

        /**4 Print all numbers from 1 to 100 inclusive where the step is 10.
         *
         */
        numberTask();

        for(int i = 1; i < 101; i += 10) {
            System.out.println(i);
        }

        /**5 Print all numbers from 0 to 100 that are divisible by 10.
         *
         */
        numberTask();

        for(int i = 0; i < 101; i += 10) {
            System.out.println(i);
        }

        /**6 Print all numbers from -100 to 100 that are divisible by 10.
         *
         */
        numberTask();

        for(int i = -100; i < 101; i += 10) {
            System.out.println(i);
        }

        /**7 Print the song "Lyrics of the song 99 Bottles of Beer".
         *
         */
        numberTask();

        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more";
        String noMoreL = "no more";
        String ln = "\n";

        for(int i = 99; i > -1; i--) {
            if (i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle +wall + dot + ln);
            } else if (i == 1) {
                System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
                System.out.println(take + commaSpace + noMoreL + bottles +wall + dot + ln);
            } else if (i == 0) {
                System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottle + dot);
                System.out.println(go + commaSpace + (i + 99) + bottles +wall + dot);
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles +wall + dot + ln);
            }
        }
    }
}
