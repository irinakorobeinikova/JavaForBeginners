package homework;

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

    public static void main(String[] args) {
        System.out.println(capitalizeWords("           happy birthday!  "));
        System.out.println(capitalizeWords(""));
        System.out.println(capitalizeWords(null));
        System.out.println(capitalizeWords("     john jacob smith jr."));
        System.out.println(capitalizeWords(" "));


    }


}
