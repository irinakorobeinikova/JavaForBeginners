package hw8;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    //Task7
    public static int[] createArrayOf5Numbers(int a, int b, int c, int d, int e) {
        int[] arr = {a, b, c, d, e};

        return arr;
    }

    //Task8
    public static double[] createArrayOf5Double(double a, double b, double c, double d, double e) {
        double[] arr = {a, b, c, d, e};

        return arr;
    }

    //Task9
    public static String[] createArrayOf5Words(String a, String b, String c, String d, String e) {
        String[] arr = {a, b, c, d, e};

        return arr;
    }



    public static void main(String[] args) {

        numberTask(5);
        /** In class HW8_1:
         * Create objects of type Integer, Double, String and assign any values to them.
         */

        Integer regNum = new Integer(45);
        Double regWeight = new Double(60.5);
        String regName = new String("Irina");

        System.out.println("Integer regNum = 45");
        System.out.println("Double regWeight = 60.5");
        System.out.println("String regName = Irina");

        numberTask(6);
        /** Compare variables specific to HW8_1 and HW8 classes
         * and print the comparison results in a table.
         */

        boolean regNum3 = regNum.equals(HW8_1.regNum1);
        boolean regWeight3 = regWeight.equals(HW8_1.regWeight1);
        boolean regName3 = regName.equals(HW8_1.regName1);

        line();
        System.out.println("| HW8                     | " + "HW8_1                    | " + "areEquals |");
        line();
        System.out.println("| Integer regNum = " + regNum + "     | " + "Integer regNum1 = "
                + HW8_1.regNum1 + "     | "  + regNum3 + "      |");
        line();
        System.out.println("| Double regWeight = " + regWeight + " | " + "Double regWeight1 = "
                + HW8_1.regWeight1 + " | "  + regWeight3 + "      |");
        line();
        System.out.println("| String regName = " + regName + "  | " + "String regName1 = "
                + HW8_1.regName1 + "  | "  + regName3 + "      |");
        line();

        numberTask(7);
        /** Write a method that takes 5 integers as input
         * and returns an array of the same numbers
         */

        System.out.println(Arrays.toString(createArrayOf5Numbers(2, 5, 7, 9, 1)));

        numberTask(8);
        /** Write a method that takes 5 doubles as input
         * and returns an array of the same numbers
         */

        System.out.println(Arrays.toString(createArrayOf5Double(1.2, 5.3, 4.0, 8.0, 6.5)));







    }
}
