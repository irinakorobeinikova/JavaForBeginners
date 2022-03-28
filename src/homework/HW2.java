package homework;

public class HW2 {

    public static void main(String[] args){

        /**Task 11
         * Create integer variables k, l, m and assign them the values of your choice.
         */
        System.out.println("Task 11");

        int k = 5;
        int l = 10;
        int m = 15;
        String line = "______________________________________________________________________________________________";

        /**Task 12
         * Display the values of variables in a column.
         */
        System.out.println("Task 12");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);

        /**Task 13
         *Print the values of variables to a string.
         */
        System.out.println("Task 13");

        System.out.print(k);
        System.out.print(l);
        System.out.println(m);
        System.out.println(line);

        /**Task 14
         * Using concatenation, print the values of variables into a string separated by commas.
         */
        System.out.println("Task 14");

        System.out.println(k + ", " + l + ", " + m);
        System.out.println(line);

        /**Task 15
         * Display the values of these variables so that it is clear which value belongs to which variable.
         * For example, it should print:
         * int a = 5; or a = 5;
         */
        System.out.println("Task 15");

        System.out.println("int k = " + k);
        System.out.println("int l = " + l);
        System.out.println("int m = " + m);
        System.out.println(line);

        /**Task 16 Print the following expressions, where instead of ... the result of an arithmetic operation
         * will be displayed: Sum of k and l = …, k * m = …, Difference of variables l and m = …
         */
        System.out.println("Task 16");

        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + (k * m));
        System.out.println("Difference of variables l and m" + (l - m));
        System.out.println(line);

        /**Task 17 Print the following expressions:
         * The result of dividing k by l = …, and the remainder of the division = …
         * The result of dividing k by m = …, and the remainder of the division = …
         * The result of dividing l by m = …, and the remainder of the division = …
         * The result of dividing m by k = …, and the remainder of the division = …
         */
        System.out.println("Task 17");

        String text1 = "The result of dividing";
        String text2 = "and the remainder of the division = ";

        System.out.println(text1 + "k by l = " + (k / l) + ", " + text2 + (k % l) + ".");
        System.out.println(text1 + "k by m = " + (k / m) + ", " + text2 + (k % m) + ".");
        System.out.println(text1 + "k by l = " + (l / m) + ", " + text2 + (l % m) + ".");
        System.out.println(text1 + "m by k = " + (m / k) + ", " + text2 + (m % k) + ".");
        System.out.println(line);

        /**Task 18 Create variables apple and student and assign them the values 40 and 6 respectively.
         * Print the following expressions:
         * If ... apples are divided by ... students, then each student will receive ... apples,
         * and ... apples will remain for the teacher.
         * Print the same expression with the values 100 and 21.
         */
        System.out.println("Task 18");

        int apple = 40;
        int student = 6;
        int resultDiv = apple / student;
        int resultRemain = apple % student;
        String text0 = "If ";
        String text3 = " apples are divided by ";
        String text4 = " students, then each student";
        String text5 = " will receive ";
        String text6 = " apples, and ";
        String text7 = " apples will remain for the teacher.";
        String textAll = text0 + apple + text3 + student + text4 + text5 + resultDiv + text6 + resultRemain + text7;

        System.out.println(textAll);
        apple = 100;
        student = 21;
        resultDiv = apple / student;
        resultRemain = apple % student;

        System.out.println(text0 + apple + text3 + student + text4 + text5 + resultDiv + text6 + resultRemain + text7);
        System.out.println(line);

        /**Task 19
         * Print calculations and final result:
         * Sum of variables k, l, m++ and sumKLM-- = …, but the difference between m++ and sumLKM = ...
         */
        System.out.println("Task 19");
        int sumLKM = l + k + m;
        int sumKLM  = k + l + m;
        m++;
        sumKLM--;
        int sumx = k + l + m + sumKLM;

        int subx = m - sumLKM;

        System.out.println(sumKLM);
        System.out.println(sumLKM);
        System.out.println("Sum of variables k, l, m++ and sumKLM-- = " + sumx + ","
                + " but the difference between m++ and sumLKM = " + subx + ".");
        System.out.println(line);

        /**Task 20
         * Show that the number 48 is a multiple of 8 and that both numbers were even. The number 47 and 49 are odd.
         */
        System.out.println("Task 20");

        System.out.println("48 % 8 = " + 48 % 8 + " multiple");
        System.out.println("48 % 2 = " + 48 % 2 + " even");
        System.out.println("8 % 2 = " + 8 % 2 + " even");

        System.out.println("47 % 2 = " + 47 % 2 + " odd" );
        System.out.println("49 % 2 = " + 49 % 2 + " odd");
        System.out.println(line);

        System.out.println("Task 21");

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        int result21 = (x + 3) * (x + 3);

        System.out.println(result21);
        System.out.println(line);

        System.out.println("Task 22");

        int result22 = ((3 + 4 * x) / 5) - (10 * (y - 5) * (a + b + c)) / x
                + 9 * (4 / x + (9 + x) / y);

        System.out.println(result22);
        System.out.println(line);

        System.out.println("Task 23");

//        int result23 = ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y));
//
//        System.out.println(result23);
//        System.out.println(line);







    }
}
