package lessons;

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
        /**1 Print all numbers from 1 to 5 inclusive.
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











    }
}
