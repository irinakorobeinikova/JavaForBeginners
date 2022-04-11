package homework;

import java.util.SortedMap;

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

    public static int subItem = 1;

    public static void subItemTask() {

        System.out.println("\u001B[34m" + "# " + subItem + " Write expressions as if-else conditions:" + "\u001B[0m");

        subItem++;
    }

    public static void main(String[] args){

        numberTask();
        numberTask();
        numberTask();

        System.out.println("(2 = 2) AND (7 = 7)");
        System.out.println((2 == 2) && (7 == 7));
        space();
        System.out.println("NOT(15 < 3);");
        System.out.println(!(15 < 3));
        space();
        System.out.println("(\"Pine\" = \"Oak\") OR (\"Cherry\" = \"Maple\")");
        System.out.println(("Pine" == "Oak") || ("Cherry" == "Maple"));
        space();
        System.out.println("Not(\"Pine\" = \"Oak\")");
        System.out.println(!("Pine" == "Oak"));
        space();
        System.out.println("(NOT(15 < 3)) AND (10 > 20)");
        System.out.println((!(15 < 3)) && (10 > 20));
        space();

        String eyes = "to see";

        int floor2 = 2;
        int floor3 = 3;

        System.out.println("(\"Eyes are given to see\") AND (\"Under the third floor is the second floor\")");
        System.out.println((eyes.equals("to see")) && (floor2 == floor3 - 1));
        space();
        System.out.println("(6 / 2 = 3) OR (7 * 5 = 20)");
        System.out.println((6 / 2 == 3) || (7 * 5 == 20));
        space();

        numberTask();

        int sec = 60;
        int param = 70;
        String watchTime = "time";
        System.out.println("(\"There are 70 seconds in a minute\") OR (\"The working clock shows the time\")");
        System.out.println(sec == param || watchTime.equals("time"));
        space();

        System.out.println("!(28 > 7) И !(300/5 = 60)");
        System.out.println(!(28 > 7) && !(300 / 5 == 60));
        space();

        String tv = "electrical appliance";
        String glass = "Glass";
        String wood = "wood";

        System.out.println("(\"TV - electrical appliance\") AND (\"Glass - wood\");");
        System.out.println((tv.equals("electrical appliance")) && (glass == wood));
        space();

        System.out.println("Not((300 < 100)) → (\"Thirst can be quenched with water\")");
        if (!(300 < 100)) {
            System.out.println("(\"Thirst can be quenched with water\")");
        }
        space();

        System.out.println("(75 < 81) → (88 = 88)");
        if (75 < 81) {
            System.out.println(88 == 88);
        }
        space();

        numberTask();

        int ageSvetlana = 22;
        int ageAndrey = 38;
        int ageNata = 47;

        if ((ageAndrey > ageSvetlana) && (ageNata > ageSvetlana)) {
            System.out.println("Andrey is older than Svetlana. Nata is older than Svetlana.");
        }
        space();

        String shelf = "books";
        String table = "catalogs";

        if (shelf.equals("books")) {
            System.out.println("There are textbooks on the shelf,");
        }

        if (table.equals("catalogs")) {
            System.out.println("there are catalogs on the table.");
        }
        space();

        int all = 100;
        int girls = 72;
        int boys = all - girls;

        if (all / 2 < girls && boys < girls && (boys + girls) == all) {
            System.out.println("Most of the children are girls. The rest are boys.");
        } else {
            System.out.println("false");
        }
        space();

        numberTask();

        int ageDrive = 16;

        if (ageDrive >= 16 && ageDrive < 150) {
            System.out.println("\"You can only get a driver's license when you turn 16.\"");
        } else {
            System.out.println("false");
        }
        space();

        numberTask();

        boolean ridePeter = false;
        boolean readPeter = true;
        boolean lookPeter = false;
        if (ridePeter && (readPeter || lookPeter)) {
            System.out.println("false");
        } else  {
            System.out.println("\"Peter does not ride the bus, but at the same time "
                    + "he reads a book or does not look out the window\"");
        }
        space();

        numberTask();

        String friends = "with friend";

        if (friends.equals("with friend")) {
            System.out.println("\"If you are with a friend, it's good\"");
        } else {
            System.out.println("\"but when it's the other way around, it's bad.\"");
        }
        space();

        numberTask();
        subItemTask();

        System.out.println("\"If you are over 18, then you are an adult. Otherwise, you are a child.\"");

        int yourAge = 18;

        if (yourAge > 18 && yourAge < 120) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }
        space();

        subItemTask();

        System.out.println("\"If the ground is dry, then there is no rain. "
                + "If the ground is wet, then it is raining.\"");

        String groundDry = "dry";

        if (groundDry.equals("dry")) {
            System.out.println("There is no rain");
        } else {
            System.out.println("It is raining");
        }
        space();

        subItemTask();

        System.out.println("\"If the ground is dry, then there is no rain. If the ground is wet, then it is raining."
                + " Otherwise it's snowing.\"");

        String groundWet = "wet";

        if (groundDry.equals("dry")) {
            System.out.println("There is no rain");
        }
        if (groundWet.equals("wet")) {
            System.out.println("It is raining");
        } else {
            System.out.println("It's snowing");
        }
        space();

        subItemTask();

        System.out.println("\"If there are clouds in the sky, it is raining, otherwise it is “ a monkey's wedding”.\"");

        String sky = "clouds";

        if (sky.equals("clouds")) {
            System.out.println("It is raining");
        } else {
            System.out.println("It is “a monkey's wedding\"");
        }
        space();

        subItemTask();

        System.out.println("\"If today is Saturday, then tomorrow is Sunday. "
                + "If today is Friday, then yesterday was Thursday. "
                + "Otherwise, yesterday was not Thursday, and tomorrow is not Sunday.\"");

        String dayOfWeek1 = "Saturday";
        String dayOfWeek2 = "Friday";

        if (dayOfWeek1.equals("Saturday")) {
            System.out.println("Tomorrow is Sunday");
        }
        if (dayOfWeek2.equals("Friday")) {
            System.out.println("Yesterday was Thursday");
        } else {
            System.out.println("Yesterday was not Thursday, and tomorrow is not Sunday");
        }
        space();

        subItemTask();

        System.out.println("\"If a crab whistled on the mountain, then eternity has passed, "
                + "otherwise you should wait farther.\"");

        String crab = "whistle";

        if (crab.equals("whistle")) {
            System.out.println("Eternity has passed");
        } else {
            System.out.println("Wait farther");
        }
        space();

        subItemTask();

        System.out.println("\"If you are 18 or you have finished school, "
                + "then you do not have to live with your parents, " + "otherwise live with your parents.\"");

        int ageTeenager = 18;
        String school = "finished";

        if (ageTeenager == 18 || school.equals("finished")) {
            System.out.println("You do not have to live with your parents");
        } else {
            System.out.println("Live with your parents");
        }
        space();

        numberTask();

        System.out.println("Check the number for evenness. "
                + "If the number is even, double that number, otherwise square the number.");

        int checkNumber = 32;

        if (checkNumber % 2 == 0) {
            System.out.println(checkNumber * 2);
        } else {
            System.out.println(checkNumber * checkNumber);
        }
        space();

        numberTask();

        System.out.println("Write an algorithm for checking the age for compliance with the conditions (if-else):\n"
                + "You can vote from the age of 18\n"
                + "You can drive a car from the age of 16\n"
                + "You can go to school from the age of 5");

        int voteAge = 18;
        int driveAge = 16;
        int schoolAge = 5;

        if (voteAge >= 18) {
            System.out.println("You can vote");
        }
        if (driveAge >= 16) {
            System.out.println("You can drive");
        }
        if (schoolAge >= 5 && schoolAge <= 21) {
            System.out.println("You can go to school");
        }

        space();

        numberTask();

        System.out.println("Check a student's grade and performs the following actions:\n" +
                "5 - issue a commendable letter and go to the next class\n" +
                "4 - go to the next class\n" +
                "3 - give a task for the summer and go to the next class\n" +
                "2 - call parents and leave in the current class for the second year");

        int grade = 4;

        if (grade == 5) {
            System.out.println("Issue a commendable letter and go to the next class");
        } else if (grade == 4) {
            System.out.println("Go to the next class");
        } else if (grade == 3) {
            System.out.println("Give a task for the summer and go to the next class");
        } else if (grade == 2) {
            System.out.println("Call parents and leave in the current class for the second year");
        }

        space();

        numberTask();

        System.out.println("Write an algorithm for a program that checks 2 numbers. "
                        + "The program adds numbers that are divisible by 3 without a remainder, "
                        + "and subtracts numbers that are divisible by 5 without a remainder. "
                        + "The program multiplies numbers that are divisible by 2 without a remainder, "
                        + "but if at least one number is negative, the program multiplies the result of "
                        + "the previous action by (-1). If the numbers have not passed any checks, "
                        + "the program prints an error about the impossibility to perform actions.");

        int digit1 = 15;
        int digit2 = 15;

        if (digit1 % 3 == 0 && digit2 % 3 == 0) {
            System.out.println("digit1 + digit2 = " + (digit1 + digit2));
        }
        if (digit1 % 5 == 0 && digit2 % 5 == 0) {
            System.out.println("digit1 - digit2 = " + (digit1 - digit2));
        }
        if (digit1 % 2 == 0 && digit2 % 2 == 0 && digit1 >= 0 && digit2 >= 0) {
            System.out.println("digit1 * digit2 = " + (digit1 * digit2));
            if (digit1 % 2 == 0 && digit2 % 2 == 0 && digit1 < 0 || digit2 < 0) {
                System.out.println("digit1 * digit2 = " + ((digit1 * digit2) * (-1)));
            }
        } else if (!(digit1 % 3 == 0 && digit2 % 3 == 0) && (!(digit1 % 5 == 0 && digit2 % 5 == 0))
                && (!(digit1 % 2 == 0 && digit2 % 2 == 0))) {
                System.out.println("Impossible to perform actions");
        }































    }
}

