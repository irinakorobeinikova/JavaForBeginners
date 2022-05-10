package lessons.lesons1to7;

public class Lesson4 {

    public static void main(String[] args){

        /** Task 100
         * Use a number.
         * If the number is odd and a multiple of 3,
         *  then read the result of division by 3.
         *  Otherwise, read the result of multiplying by three.
         *  If the number is odd, then the product of the number is read result of division by 2.
         *
         *  Output the result of the print algorithm.
         *  We present to your attention in the presentation which block is compiled according to the algorithm.
         *
         *  Write a test that will test your code and output print the result of the check.
         *  Test data 23, 44, 21
         */

        int n = 21;
        int expectedResult = 3;

        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println(n);

        //Test
        if (expectedResult == n) {
            System.out.println("\u001B[32m" + "Pass");
        } else {
            System.out.println("\u001B[31m" + "Fail");
        }




    }
}
