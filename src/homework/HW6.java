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








    }
}
