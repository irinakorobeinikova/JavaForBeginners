package lessons;

public class Lesson2 {

    public static void main(String[] args){

        String line = "___________________________________";
        int a = 5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int mulAB = a * b;
        int devBA = b / a;

        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);

        System.out.println("sum = " + a + b);
        System.out.println("sum = " + (a + b));
        System.out.println(sumAB);
        System.out.println(sumABC);

        System.out.println(line);
        System.out.println(a + b + " " + a + b);
        System.out.println(line);

        System.out.println("" + a + " " + b + " " + c);
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        System.out.print("Today is ");
        System.out.println("Monday");
        System.out.println("He said \"Go!\" and run.");
        System.out.println("Today is\nMonday");
        System.out.println("Today\tis\tMonday");

        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + d);

        System.out.println(a * b);
        System.out.println(mulAB);
        System.out.println(5 * 13);

        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(a / b);

        System.out.println(a % b);
        System.out.println(b % a);
        System.out.println(25 % 5);
        System.out.println(100 % 3);

        System.out.println(line);
        // Doesn't work!   System.out.println(a++);
        a++;
        System.out.println(a);
        System.out.println(a + 1);
        System.out.println(line);

        b--;
        System.out.println(b);
        System.out.println(b - 1);





    }
}
