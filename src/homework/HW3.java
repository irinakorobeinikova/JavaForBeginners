package homework;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HW3 {

    public static void main(String[] args){

        System.out.println("Task 2");

        byte a = 25;
        byte b = 100;
        String line = "**********************************************************************************************";

        System.out.println(a);
        System.out.println(b);
        System.out.println(line);

        System.out.println("Task 3");

        short s = -30000;
        short t = 30000;

        System.out.println(s);
        System.out.println(t);
        System.out.println(line);

        System.out.println("Task 4");

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("_______________________________");
        System.out.println("|    int min    | " +  min + " |");
        System.out.println("_______________________________");
        System.out.println("|    int max    |  " +  max + " |");
        System.out.println("_______________________________");
        System.out.println(line);

       System.out.println("Task 5");

       String phoneNumber = "18009998877";

       System.out.println(phoneNumber);
       System.out.println(line);

       System.out.println("Task 6");
       float f = 100.101101F;
       double d = 100.101101;

        System.out.println("____________________________________");
        System.out.println("|    float f     |    " + f + "    |");
        System.out.println("____________________________________");
        System.out.println("|    double d    |    " + d + "    |");
        System.out.println("____________________________________");
        System.out.println(line);

        System.out.println("Task 7");

        Double dd = 10.09999 + 20.099999;
        Float ff = 10.09999F + 20.099999F;

        System.out.println("_______________________________________");
        System.out.println("|   Double dd    | " + dd + " |");
        System.out.println("_______________________________________");
        System.out.println("|    Float ff    |     " + ff + "       |");
        System.out.println("_______________________________________");
        System.out.println(line);

        System.out.println("Task 8");

        double result = 10 / 3;

        System.out.println(result);
        System.out.println(line);

        System.out.println("Task 9");

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
        System.out.println(line);

        System.out.println("Task 10");

        System.out.println(".  .  ....  .    .      .. ");
        System.out.println(".  .  .     .    .     .  .");
        System.out.println("....  ....  .    .     .  .");
        System.out.println(".  .  .     .    .     .  .");
        System.out.println(".  .  ....  .... ....   .. ");
        System.out.println(line);

        System.out.println("Task 11");

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        double t4 = - 505.505;
        int t5 = 100100;
        long t6 = 100010001000L;
        float t7 = 2.66666666666666F;
        double t8 = - 1000000.001;
        int t9 = 1010;

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
        System.out.println("t6 = " + t6);
        System.out.println("t7 = " + t7);
        System.out.println("t8 = " + t8);
        System.out.println("t9 = " + t9);
        System.out.println(line);

        System.out.println("Task 12");

        System.out.println("________________________________________________________________________");
        System.out.println("| Type   |" + "Size in bits |          " + "min         |          " + "max           |");
        System.out.println("________________________________________________________________________");
        System.out.println("| " + Byte.TYPE + "   |       " + Byte.SIZE + "     |         " + Byte.MIN_VALUE
                + "         |          " + Byte.MAX_VALUE + "           |");
        System.out.println("________________________________________________________________________");
        System.out.println("| " + Short.TYPE + "  |       " + Short.SIZE + "    |        " + Short.MIN_VALUE
                + "        |         " + Short.MAX_VALUE + "          |");
        System.out.println("________________________________________________________________________");
        System.out.println("| " + Integer.TYPE + "    |       " + Integer.SIZE + "    |      " + Integer.MIN_VALUE
                + "     |       " + Integer.MAX_VALUE + "       |");
        System.out.println("________________________________________________________________________");
        System.out.println("| " + Long.TYPE + "   |      " + Long.SIZE + "     | " + Long.MIN_VALUE + " |   "
                + Long.MAX_VALUE + "  |");
        System.out.println("________________________________________________________________________");
        System.out.println("| " + Float.TYPE + "  |      " + Float.SIZE + "     |       " + Float.MIN_VALUE
                + "        |      " + Float.MAX_VALUE + "      |");
        System.out.println("________________________________________________________________________");
        System.out.println("| " + Double.TYPE + " |      " + Double.SIZE + "     |       " + Double.MIN_VALUE
                + "       | " + Double.MAX_VALUE + " |");
        System.out.println("________________________________________________________________________");




















    }
}
