package hw8;

import utils.Utils;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    //Task 7
    public static int[] createArrayOf5Numbers(int a, int b, int c, int d, int e) {
        int[] arr = {a, b, c, d, e};

        return arr;
    }

    //Task 8
    public static double[] createArrayOf5Double(double a, double b, double c, double d, double e) {
        double[] arr = {a, b, c, d, e};

        return arr;
    }

    //Task 9
    public static String[] createArrayOf5Words(String a, String b, String c, String d, String e) {
        String[] arr = {a, b, c, d, e};

        return arr;
    }

    //generic method
    public static <T> T[] createArray(T a, T b, T c, T d, T e) {

        return (T[]) new Object[]{a, b, c, d, e};
    }

    //Task 10
    public static double[] multipleArray(int[] array, double a) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * a;
        }

        return newArray;
    }

    //Task 11
    public static boolean containsNegativeNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {

                return true;
            }
        }
        return false;
    }

    //Task 11
    public static int returnEvenNumIfNoNegatives(int[] array) {
        if (!containsNegativeNumbers(array) && array.length != 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count++;

                }
            }

            return count;
        }

        return Integer.MIN_VALUE;
    }

    //Task 12
    public static int countOdds(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    //Task12
    public static int[] createArrayOfOdds(int[] array) {
        int a = countOdds(array);
        int[] oddsArray = new int[a];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddsArray[oddsArray.length - a] = array[i];
                a--;
            }
        }
        return oddsArray;
    }

    //Task 13
    public static boolean[] returnTrueOrFalseMore10(int[] array) {
        boolean[] arrayBoolean = new boolean[array.length];
        if (array == null || array.length == 0) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                arrayBoolean[i] = true;
            } else {
                arrayBoolean[i] = false;
            }
        }

        return arrayBoolean;
    }

    //Task 14
    public static String returnStringOfWords(String[] array) {
        String arrayString = "";
        if (array == null || array.length == 0) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            arrayString += array[i] + " ";

        }

        return arrayString;
    }

    //Task 15
    public static int sumOfNumbersOfArray(int[] array) {
        int sumOfNumbers = 0;
        if (array.length > 0) {
            for (int i = array.length / 2; i < array.length; i++) {
                sumOfNumbers += array[i];
            }
        }

        return sumOfNumbers;
    }

    //Task 16
    public static int[] returnMultiplicationTable(int num) {
        int[] table = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < table.length; i++) {
            if (num >= 1 && num < 10) {
                table[i] = num * table[i];
            } else {
                return null;
            }

        }

        return table;
    }

    //Task 17
    public static int countEven(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    //Task17
    public static int[] createArrayOfEven(int[] array) {
        int a = countEven(array);
        int[] evenArray = new int[a];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenArray.length - a] = array[i];
                a--;
            }
        }
        return evenArray;
    }

    //Task 17
    public static int[] returnArrayOfOddOrEvenNum(int[] array) {
        if (countOdds(array) > countEven(array)) {
            return createArrayOfOdds(array);
        } else if (countEven(array) > countOdds(array)) {
            return createArrayOfEven(array);
        } else {
            return null;
        }
    }

    //Task 18
    public static int countLength(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        return counter;
    }

    //Task 18
    public static int[] createRandomArray1(int[] array) {
        if (array.length <= 0) {
            return null;
        }
        int arrayR = countLength(array);
        int[] randomArray = new int[arrayR];
        for (int i = 0; i < array.length; i++) {
            randomArray[i] = (int) (Math.random() * 99) + 1;
        }

        return randomArray;
    }

    //Task 18.1
    public static int[] createRandomArray2(int length, int from, int to) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + (int) (Math.random() * (to + 1));
        }
        return array;
    }

    //Task 19
    public static int randomInt(int upper, int lower) {
        return (int) (Math.random() * (upper - lower)) + lower;
    }

    //Task 19
    public static int[] createRandomArrayLToD(int l, int d) {
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.randomInt((int) Math.pow(10, d - 1) * 10, (int) Math.pow(10, d - 1));
        }

        return array;
    }

    //Task 20
    public static int[] createDoubleDigitArray(int[] array) {
        if (array.length <= 0) {
            return null;
        }
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 & array[i] < 100) {
                count++;
            }
        }

        int[] newArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                newArray[newArray.length - count] = array[i];
                count--;
            }
        }

        return newArray;
    }

    //Task 21
    public static int[] createDifferencesArray(int[] array) {
        if (array.length <= 0) {
            return null;
        }
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = Math.abs(array[i] / 10 - array[i] % 10);
        }

        return newArray;
    }

    //Task 22
    public static String selectCountry(int number) {
        switch (number) {
            case 1:
                return "USA";
            case 33:
                return "France";
            case 34:
                return "Spain";
            case 44:
                return "United Kingdom";
            default:
                return "Unknown country";
        }
    }

    //Task 22
    public static String[] returnThePhone(int[] array) {
        String phoneNumber = "";
        String country = selectCountry(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                phoneNumber += "(" + array[i];
            } else if (i == 3) {
                phoneNumber += array[i] + ")";
            } else if (i == 6) {
                phoneNumber += array[i] + "-";
            } else if (i == 8) {
                phoneNumber += array[i] + "-";
            } else {
                phoneNumber += array[i];
            }
        }

        return new String[]{phoneNumber, country};
    }

    //Task 23
    public static int[] createUniqueArray(int[] array) {

        int count = 0;                                       //replace duplicate
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {            //count "0"
            if (array[i] == 0) {
                count++;
            }
        }
        count = 0;
        int[] uniqueArray = new int[array.length - count];  //unique array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                uniqueArray[count] = array[i];
                count++;
            }
        }
        return uniqueArray;
    }


    // Task 24
    public static int[] countUniqueNonUnique(int[] array) {
        int n = 0;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            array[i] = -1;
                            n++;
                        }
                    }
                }
            }

            return new int[]{array.length - n, n};
        }
        return new int[]{0, 0};
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
                + HW8_1.regNum1 + "     | " + regNum3 + "      |");
        line();
        System.out.println("| Double regWeight = " + regWeight + " | " + "Double regWeight1 = "
                + HW8_1.regWeight1 + " | " + regWeight3 + "      |");
        line();
        System.out.println("| String regName = " + regName + "  | " + "String regName1 = "
                + HW8_1.regName1 + "  | " + regName3 + "      |");
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

        numberTask(9);
        /** Write a method that takes 5 words as input
         * and returns an array of these words
         */

        System.out.println(Arrays.toString(createArrayOf5Words("Pavel", "Irina", "Darya",
                "Veronika", "Egor")));

        line();
        //generic
        System.out.println(Arrays.toString(createArray(1, 2, 3, 4, 5)));
        System.out.println(Arrays.toString(createArray(0.5, 5.2, 4.8, 5.0, 9.1)));
        System.out.println(Arrays.toString(createArray("one", "two", "three", "four", "five")));

        numberTask(10);
        /** Write a method that takes an array of integers as input
         * and returns an array of the same numbers multiplied by 2.5
         */

        int[] array = {1, 2, 3};

        System.out.println(Arrays.toString(multipleArray(array, 2.5)));

        numberTask(11);
        /** Write a method that takes an array of positive integers as input
         * and returns the number of even numbers in this array.
         */

        int[] array1 = {2, 4, 5, 15, 8, 20};
        int[] array2 = {-2, -4, 5, -15, 8, 20};

        System.out.println(returnEvenNumIfNoNegatives(array1));
        System.out.println(returnEvenNumIfNoNegatives(array2));

        numberTask(12);
        /** Write a method that takes an array of positive integers as input
         * and returns an array of odd numbers.
         */

        int[] array3 = {2, 4, 5, 15, 8, 20, 21, 43, 51};

        System.out.println(countOdds(array3));
        System.out.println(Arrays.toString(createArrayOfOdds(array3)));

        numberTask(13);
        /** Write a method that takes an array of integers as input
         * and returns an array of values true or false if the numbers are greater than 10
         */

        int[] array4 = {12, 14, 5, 15, 8, 25, 1, 3, 51};
        System.out.println(Arrays.toString(returnTrueOrFalseMore10(array4)));

        numberTask(14);
        /** Write a method that takes an array of words as input
         * and returns a string consisting of these words.
         */

        String[] array5 = {"I", "like", "playing", "the", "guitar"};
        System.out.println(returnStringOfWords(array5));

        numberTask(15);
        /** Write a method that takes an array of integers
         * and calculates the sum of the numbers in the second half of the array.
         */

        int[] array6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOfNumbersOfArray(array6));

        numberTask(16);
        /** Write a method that takes as input a positive integer in the range from 1 to 10 exclusively,
         * and returns the multiplication table for this number as an array.
         */

        System.out.println(Arrays.toString(returnMultiplicationTable(2)));
        System.out.println(Arrays.toString(returnMultiplicationTable(-2)));

        numberTask(17);
        /** Write a method that takes an array of integers
         * and returns an array of even numbers if there are more even numbers,
         * or an array of odd numbers if there are more odd numbers.
         */

        int[] array7 = {8, 14, 4, 30, 6, 15, 10, 13, 17};
        int[] array8 = {7, 11, 5, 29, 8, 25, 32, 23, 21};

        System.out.println(Arrays.toString(returnArrayOfOddOrEvenNum(array7)));
        System.out.println(Arrays.toString(returnArrayOfOddOrEvenNum(array8)));

        numberTask(18);
        /** Write a method that takes the length of an array as input
         * and generates an array of random positive numbers from 0 to 100 exclusively.
         */

        int[] array9 = {70, 81, 5, 19, 18, 2, 34, 23};

        System.out.println(countLength(array9));
        System.out.println(Arrays.toString(createRandomArray1(array9)));

        numberTask(19);
        /** Write a method that takes as input the length of the array l
         * and the number of characters d (one-digit, two-digit, three-digit, etc. numbers),
         * and generates an array of random positive integers of length l,
         * in which all numbers have the number of characters d.
         */

        System.out.println(Arrays.toString(createRandomArrayLToD(7, 1)));
        System.out.println(Arrays.toString(createRandomArrayLToD(5, 2)));
        System.out.println(Arrays.toString(createRandomArrayLToD(8, 3)));

        numberTask(20);
        /** Write a method that takes an array of positive integers as input
         * and returns an array of only two-digit numbers.
         */

        int[] array10 = {70, 10, 53, 19, 18, 26, 43, 12};
        System.out.println(Arrays.toString(createDoubleDigitArray(array10)));

        numberTask(21);
        /** Write a method that takes an array of positive integer two-digit numbers as input
         * and returns an array of differences between tens and ones.
         *
         */

        int[] array11 = {17, 10, 54, 29, 17, 28, 43, 23};
        System.out.println(Arrays.toString(createDifferencesArray(array11)));

        numberTask(22);
        /** Write a method that takes an array of 11 positive integers from 0 to 9
         * and returns an array that contains a phone number consisting of these numbers
         * and the name of the country to which the number belongs.
         */

        int[] array12 = {1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(returnThePhone(array12)));

        numberTask(23);
        /** Write a method that takes an array of positive integers greater than 0
         * and returns an array of unique numbers.
         */

        int[] array13 = {8, 6, 0, 5, 7, 1, 2, 3, 8, 6, 4, 7};
        ;
        System.out.println(Arrays.toString(createUniqueArray(array13)));

        numberTask(24);
        /** Write a method that takes an array of positive integers as input
         * and returns the number of unique and non-unique elements in this array.
         */

        System.out.println(Arrays.toString(countUniqueNonUnique(array13)));

        numberTask(25);
        /** Write a method that takes an array of positive integers
         * and 2 positive integers (index values) as input.
         * The method returns an array that contains only the numbers
         * from the first array in between the indices.
         */


    }
}
