package lessons.lesson10StringChar;

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

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                System.out.println(str4.charAt(i));
            } else {
                System.out.println("Letter not a");
            }
        }







    }
}
