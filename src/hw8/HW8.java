package hw8;

import static utils.Utils.*;

public class HW8 {



    public static void main(String[] args) {

        numberTask(5);
        /** In class HW8_1:
         * Create objects of type Integer, Double, String and assign any values to them.
         */

        Integer regNum = new Integer(45);
        Double regWeight = new Double(60.5);
        String regName = new String("Irina");

        boolean regNum3 = regNum.equals(HW8_1.regNum1);
        boolean regWeight3 = regWeight.equals(HW8_1.regWeight1);
        boolean regName3 = regName.equals(HW8_1.regName1);

        numberTask(6);
        /** Compare variables specific to HW8_1 and HW8 classes
         * and print the comparison results in a table.
         */

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





    }
}
