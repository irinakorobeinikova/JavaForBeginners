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

        short s = Short.MAX_VALUE;
        short t = Short.MAX_VALUE - 60000;

        System.out.println(s + "\n" + t);
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

        long phoneNumber = 18009998877L;

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
        System.out.println("|    float f     |     " + f + "     |");
        System.out.println("_______________________________________");
        System.out.println("|    double d    |     " + d + "     |");
        System.out.println("_______________________________________");
        System.out.println("|   Double dd    | " + dd + " |");
        System.out.println("_______________________________________");
        System.out.println("|    Float ff    |     " + ff + "       |");
        System.out.println("_______________________________________");
        System.out.println(line);

        System.out.println("Task 8");

        double result = 10.0 / 3;

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

        String hello1 = "*  *  ****  *    *      ** ";
        String hello2 = "*  *  *     *    *     *  *";
        String hello3 = "****  ****  *    *     *  *";
        String hello4 = "*  *  ****  **** ****   ** ";

        System.out.println(hello1 + "\n" + hello2 + "\n" + hello3 + "\n" + hello2 + "\n" + hello4);
        System.out.println(line);

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
        float t4 = - 505.505F;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
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
        System.out.println(line);

        System.out.println("Task 13");

        Integer num1 = 45;
        Integer num2 = 45;

        System.out.println("If num1 = num2, then the result of the method.equals = " + num1.equals(num2));

        num1 = 35;

        System.out.println("If num1 != num2, then the result of the method.equals = " + num1.equals(num2));
        System.out.println(line);

        System.out.println("Task 14");

        int number1 = 20;
        int number2 = 20;

        System.out.println("If number1 = number2, then the result of the method.compare = "
                + Integer.compare(number1,number2));

        number1 = 15;
        number2 = 25;

        System.out.println("If number1 < number2, then the result of the method.compare = "
                + Integer.compare(number1,number2));

        number1 = 40;
        number2 = 35;

        System.out.println("If number1 > number2, then the result of the method.compare = "
                + Integer.compare(number1,number2));
        System.out.println(line);

        System.out.println("Task 15");

        float x = 234.9999F;

        System.out.println("Converting float to int using down-casting = " + (int) x);
        System.out.println("Converting float to int using rounding = " + Math.round(x));
        System.out.println(line);

        System.out.println("Task 16");

        double sum1 = 12.369;
        double sum2 = 38.258;

        System.out.println(Double.sum(sum1, sum2));
        System.out.println(line);

        System.out.println("Task 17");

        Float w1 = 150.18F;
        Float w2 = 175.55F;

        System.out.println(Integer.sum(w1.intValue(), w2.intValue()));
        System.out.println(line);

        System.out.println("Task 18");

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println("12000 - 12300 = " + Short.compareUnsigned(short1, short2));

        short1 = 12500;

        System.out.println("12500 - 12300 = " + Short.compare(short1, short2));
        System.out.println(line);

        System.out.println("Task 19");

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(doub1 - doub2);
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));
        System.out.println(line);

        System.out.println("Task 20");

        Float tempCat = 37.3F;
        Float average = tempCat / 2;
        tempCat = 35.6F;
        average = average + tempCat / 2;

        System.out.println("The average temperature =" + Math.round(average));
        System.out.println(line);

        System.out.println("Task 21");

        Number n = Long.MAX_VALUE;
        n = 10;
        n = 10.999999999;

        System.out.println("The variable n can take on the following values: "
             + "n = " + Long.MAX_VALUE + ";"
             + "n = " + n.intValue() + ";"
             + "n = " + n + ";"
             + "This is possible because class Number is the superclass of platform classes representing numeric "
             + "values that are convertible to primitive types of byte, short, integer, long, float and double.");
        System.out.println(line);


        System.out.println("Task 22");

        Integer numberInteger = 100;
        String number = numberInteger.toString();

        System.out.println(numberInteger.getClass());
        System.out.println(number.getClass());
        System.out.println(line);


    }
}
