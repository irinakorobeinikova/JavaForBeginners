package homework;

public class HW4 {

    public static int number = 1;

    public static void numberTask() {

        System.out.println("\u001B[33m" + "*****************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "*****************" + "\u001B[0m");

        number++;
        System.out.println();
    }

    public static void space() {

        System.out.println();
    }

    public static void main(String[] args){

        numberTask();

        numberTask();

        String exression1 = "(Eyes are given to see)";
        String exression2 = "(Under the third floor is the second floor)";

        System.out.println("(2 = 2) AND (7 = 7)");
        System.out.println((2 == 2) && (7 == 7));
        space();
        System.out.println("NOT(15 < 3);");
        System.out.println(!(15 < 3));
        space();
        System.out.println("(Pine = Oak) OR (Cherry = Maple)");
        System.out.println(("Pine" == "Oak") || ("Cherry" == "Maple"));
        space();
        System.out.println("Not(Pine = Oak)");
        System.out.println(!("Pine" == "Oak"));
        space();
        System.out.println("(NOT(15 < 3)) AND (10 > 20)");
        System.out.println((!(15 < 3)) && (10 > 20));
        space();
        System.out.println("(Eyes are given to see)" + " AND " + "(Under the third floor is the second floor)");
        System.out.println(exression1 == exression2 && exression2 == exression1);
        space();
        System.out.println("(6 / 2 = 3) OR (7 * 5 = 20)");
        System.out.println((6 / 2 == 3) || (7 * 5 == 20));
        space();




    }
}

