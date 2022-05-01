package homework;

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
        catsNames[1] = "Smokey";
        catsNames[2] = "Whiskers";
        catsNames[3] = "Tiger";
        catsNames[4] = "Lucky";
        catsNames[5] = "Simba";
        catsNames[6] = "Ginger";
        catsNames[7] = "Felix";

        System.out.println(catsNames[3]);
        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);













    }
}
