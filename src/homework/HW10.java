package homework;

import java.util.Arrays;

/** Write a CapitalizeWords algorithm that accepts as input
 * sentence with a single space between words,
 * and returns a sentence in which all words are capitalized
 * "           happy birthday!  " --> "Happy Birthday!"
 */

public class HW10 {

    public static String capitalizeWords(String sentence) {
        if (sentence != null) {
            sentence = sentence.trim();

            if (sentence.length() != 0) {
                //Character.toString(sentence.charAt(0)).toUpperCase()
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);
                    }
                }

                return sentence;
            }

            return "";
        }

        return "";
    }

    public static int[] returnMinMaxAveArray(int[] array, int index1, int index2) {

        if (array == null || array.length < 1 || index1 < 0 || index1 > index2 || index2 > array.length) {

            return new int[] {};
        }

        int minValue = array[index1];
        int maxValue = array[index2];
        int aveValue = 0;
        int sum = 0;

        for (int i = index1; i <= index2; i++) {
            if (array[index1] < array[i]) {
                maxValue = array[i];
            }
            if (array[index1] > array[i]) {
                minValue = array[i];
            }
            sum += array[i];
        }

        aveValue = sum / (index2 - index1 + 1);
        int[] result = {minValue, maxValue, aveValue};

        return result;
    }


    public static void main(String[] args) {
        System.out.println(capitalizeWords("           happy birthday!  "));
        System.out.println(capitalizeWords(""));
        System.out.println(capitalizeWords(null));
        System.out.println(capitalizeWords("     john jacob smith jr."));
        System.out.println(capitalizeWords(" "));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;

        System.out.println(Arrays.toString(returnMinMaxAveArray(arr, a, b)));







    }


}
