package lessons.lesons1to7;

public class Lesson4_1 {

    public static void m() {
        System.out.println("Hello");
    }

    public static void m1(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void m1(int a, String s) {
        System.out.println(a + s);
    }

    public static void m1(int a, int b, int c) {
        int division = a / b;
        System.out.println(division);
    }

    public static void m2() {
        int a = 5;
        int b = 1;
        int sum = a + b;
        System.out.println(sum);
    }

    public static void printTaskTitle(int a) {
//        a ++;
        System.out.println("Task " + a);
        System.out.println("=================================");
    }

    public static void mPrint(int m) {
        System.out.println(m);
    }
    public static void mPrint(String f) {
        System.out.println(f);
    }
    public static void mPrint(char c) {
        System.out.println(c);
    }

    public static void main(String[] args) {
        m();
        m1(5, 7);
        m1(2, "Hello");
        m1(8, 2, 3);
        m2();
        printTaskTitle(1);
        printTaskTitle(2);

        mPrint(10);
        mPrint("Hello");
        mPrint('a');


    }


}
