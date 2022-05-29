package lessons.lesson10StringChar;

import java.util.Arrays;

public class Lesson10 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');

        System.out.println(a == aa);          //true
        System.out.println(aa == aaa);        //false
        System.out.println(aa.equals(aaa));   //true

        String strA = "a";
        //System.out.println(a == strA);  //StringIndexOutOfBoundsException

        System.out.println(str1 + space + str2 + space+ str3);

        String str4 = str1 + space + str2 + space+ str3;
        System.out.println(str4);

        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));
        //System.out.println(str1.charAt(4)); //StringIndexOutOfBoundsException

        for (int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i));
        }

//        for (int i = 0; i < str4.length(); i++) {
//            if (str4.charAt(i) == 'a') {
//                System.out.println(i);              //indices
//                System.out.println(str4.charAt(i)); //letter
//            } else {
//                System.out.println("Letter not a");
//            }
//        }

//        for (int i = 0; i < str4.length(); i++) {
//            if (str4.charAt(i) < 'i') {
//                System.out.println(str4.charAt(i)); //letter
//            } else {
//                System.out.println(">= i");
//            }
//        }

        System.out.println('i' - 1);
        System.out.println('i');
        System.out.println('i' + 1);

        System.out.println(Character.toString('i' - 1));
        System.out.println('i');
        System.out.println(Character.toString('i' + 1));

        //convert string to array
        String[] arrayStr = new String[str4.length()];

        for (int i = 0; i < str4.length(); i++) {
            arrayStr[i] = Character.toString(str4.charAt(i));
        }

        System.out.println(Arrays.toString(arrayStr));               //[J, a, v, a,  , i, s,  , f, u, n]

        System.out.println(str4.toCharArray());                      //Java is fun
        System.out.println(Arrays.toString(str4.toCharArray()));     //[J, a, v, a,  , i, s,  , f, u, n]

        char[] arrayChar = str4.toCharArray();
        System.out.println(arrayStr[0].equals(arrayChar[0]));        //false
        System.out.println(arrayStr[0].compareTo(Character.toString(arrayChar[0])));     //0(true)
//        if (arrayStr[0].compareTo(Character.toString(arrayChar[0])) == 0) {
//        }

        System.out.println(str4);                 //Java is fun
        System.out.println(str4.toLowerCase());   //Java is fun
        System.out.println(str4.toUpperCase());   //JAVA IS FUN

        String str5 = str4.toUpperCase();         //0(true)
        System.out.println(str4.compareToIgnoreCase(str5));






    }
}
