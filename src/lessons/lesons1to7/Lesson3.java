package lessons.lesons1to7;

public class Lesson3 {

//    static int a;
//    static Integer A;
//    static double d;
//    static Double D;
//    static String S;

    public static void main(String[] args) {

        int a;
        Integer A;

        a = 10;
        A = 0;
        A = null;
        A = 15;

        A.toString();

        System.out.println(A + A);
        System.out.println(A.toString() + A);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer.sum(5,10);
        System.out.println(Integer.sum(5, 10));

        int c = 5;

        Integer.valueOf(c);


//        Codes for printing text in different colors:
//
//        public static final String ANSI_RESET = "\u001B[0m";
//        public static final String ANSI_BLACK = "\u001B[30m";
//        public static final String ANSI_RED = "\u001B[31m";
//        public static final String ANSI_GREEN = "\u001B[32m";
//        public static final String ANSI_YELLOW = "\u001B[33m";
//        public static final String ANSI_BLUE = "\u001B[34m";
//        public static final String ANSI_PURPLE = "\u001B[35m";
//        public static final String ANSI_CYAN = "\u001B[36m";
//        public static final String ANSI_WHITE = "\u001B[37m";


    }
}
