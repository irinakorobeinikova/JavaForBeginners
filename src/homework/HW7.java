package homework;

import java.util.Arrays;

public class HW7 {

    public static void numberTask(int number) {

        System.out.println();
        System.out.println("\u001B[33m" + "**************************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "**************************" + "\u001B[0m");

        number++;
        System.out.println();
    }



    public static void main(String[] args) {

        numberTask(1);
        /** Create an array of catsNames, fill it with any values.
         *
         */

        String[] catsNames = new String[8];
        catsNames[0] = "Kitty";
        catsNames[1] = "Lucky";
        catsNames[2] = "Whiskers";
        catsNames[3] = "Tiger";
        catsNames[4] = "Shadow";
        catsNames[5] = "Simba";
        catsNames[6] = "Fluffy";
        catsNames[7] = "Felix";

        System.out.println(catsNames[3]);
        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);

        numberTask(2);
        /** In the catsNames array, change the value of the element with index 4 to “Ginger”,
         * and the value of the element with index 1 to “Smokey”.
         */

        catsNames[4] = "Ginger";
        catsNames[1] = "Smokey";

        System.out.println(catsNames[4]);
        System.out.println(catsNames[1]);

        numberTask(3);
        /** Create an array of catsColors and fill it with values.
         *
         */

        String[] catsColors = {"Blue", "Black", "Grey", "Cinnamon", "Red", "Grey", "Brown", "Grey"};

        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }

        numberTask(4);
        /** Create an array of catsAges and fill it with values.
         *
         */

        int[] catsAges = {1, 5, 3, 2, 4, 6, 7, 8};

        System.out.println(Arrays.toString(catsAges));

        numberTask(5);
        /** Create an isCatRed array and surround it with acceptable values/
         *
         */

        boolean isCatRed[] = new boolean[8];

        for (int i = 0; i < 8; i++) {
            if (catsColors[i].equals("Red")) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }























    }
}
