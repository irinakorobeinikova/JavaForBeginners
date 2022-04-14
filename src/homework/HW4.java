package homework;

public class HW4 {

    public static int number = 1;

    public static void numberTask() {

        System.out.println();
        System.out.println("\u001B[33m" + "**************************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "**************************" + "\u001B[0m");

        number++;
        System.out.println();
    }

    public static int subItem = 1;

    public static void subItemTask() {

        System.out.println("\u001B[34m" + "# " + subItem + " Write expressions as if-else conditions:" + "\u001B[0m");

        subItem++;
    }

    public static void taskApples(int ap, int st) {

        System.out.println("If " + ap + " apples are divided by " + st + " students, then each student will receive "
                + (ap / st) + " apples, and " + (ap % st) + " apples will remain with the teacher.");
    }

    public static void compareMethod(int firstNum, int secondNum) {

        System.out.println("The result of dividing " + firstNum + " by " + secondNum + " = "
                + (firstNum / secondNum) + " and the remainder of the division = " + (firstNum % secondNum));
    }

    public static String applesDev(int a) {

        int appleLastNum = a;
        String app = "";

        if (appleLastNum == 1) {
            app = "apple";
        } else if (appleLastNum > 1  || appleLastNum == 0) {
            app = "apples";
        }
        return app;
    }

    public static String studentsDev(int s) {

        int studentsLastNum = s;
        String stud = " ";

        if (studentsLastNum == 1) {
            stud = "student";
        } else if (studentsLastNum > 1 ) {
            stud = "students";
        }
        return stud;
    }

    public static String countResult(int numOFApples, int numOfStudents) {

        if (numOfStudents != 0) {

            System.out.println("If " + numOFApples + " " + applesDev(numOFApples) + " are divided by " + numOfStudents
                    + " " + studentsDev(numOfStudents) + " then each student will receive " + (numOFApples / numOfStudents)
                    + " " + applesDev(numOFApples / numOfStudents) + " and " + (numOFApples % numOfStudents) + " "
                    + applesDev(numOFApples % numOfStudents) + " will remain with the teacher.");
        } else {

            System.out.println("The number of students should be more than 0");
        }

        return null;
    }

    public static void tempCF(double tC) {
        System.out.println("Temperature Celsius = " + tC + " or in Fahrenheit = " + ((tC * 9 / 5) + 32));
    }

    public static int getMinValue(int i) {

        int aMin = Integer.MIN_VALUE;

        return aMin;
    }

    public static int getMaxValue(int i) {

        int aMax = Integer.MAX_VALUE;

        return aMax;
    }

    public static double getPowValue(int i) {

        double a2 = 2;
        a2 = Math.pow(i, a2);

        return a2;
    }

    public static void task10Validate(int v) {
        int test = v;

        if (test % 2 == 0) {
            System.out.println(test * 2);
        } else {
            System.out.println(test * test);
        }
    }

    public static void assertIntegerResult(int expectedResult, int actualResult) {

        if (actualResult == expectedResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

//    public static void assertStringResult(String expectResult, String actualResult) {
//
//        if (expectResult.equals(actualResult)) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
//    }

    public static void main(String[] args){

        numberTask();
        /**In the package, create class HW4 homework, do all the work in this class
         */

        numberTask();
        /**Write a method that will print the task number before each answer. Come up with your own design.
         */

        numberTask();
        /**Write the following logical expressions in code:
         * (2 = 2) AND (7 = 7)
         * NOT(15 < 3)
         * ("Pine" = "Oak") OR ("Cherry" = "Maple")
         * NOT("Pine" = "Oak")
         * NOT(15 < 3) AND (10 > 20)
         * "Eyes are given to see AND the third floor is under the second floor"
         * (6 / 2 = 3) OR (7 * 5 = 20)
         */

        String eyes = "to see";
        int floor2 = 2;
        int floor3 = 3;

        System.out.println((2 == 2) && (7 == 7));
        System.out.println(!(15 < 3));
        System.out.println(("Pine" == "Oak") || ("Cherry" == "Maple"));
        System.out.println(!("Pine" == "Oak"));
        System.out.println((!(15 < 3)) && (10 > 20));
        System.out.println((eyes.equals("to see")) && (floor2 == floor3 - 1));
        System.out.println((6 / 2 == 3) || (7 * 5 == 20));

        numberTask();
        /**Write as code:
         * ("There are 70 seconds in a minute") OR ("The working clock shows the time")
         * "!(28 > 7) AND !(300/5 = 60)"
         * ("TV - electrical appliance") AND ("Glass - wood")
         * "Not((300 < 100)) → ("Thirst can be quenched with water")"
         * "(75 < 81) → (88 = 88)"
         */

        int sec = 60;
        int param = 70;
        String watchTime = "time";
        String tv = "electrical appliance";
        String glass = "Glass";
        String wood = "wood";

        System.out.println(sec == param || watchTime.equals("time"));
        System.out.println(!(28 > 7) && !(300 / 5 == 60));
        System.out.println((tv.equals("electrical appliance")) && (glass == wood));

        if (!(300 < 100)) {
            System.out.println("Thirst can be quenched with water");
        }
        if (75 < 81) {
            System.out.println("88 = 88");
        }

        numberTask();
        /**Write as code:
         * a) Andrei is older than Svetlana. Natasha is older than Svetlana.
         * b) There are textbooks on the shelf and catalogs on the table.
         * c) Most of the children are girls. The rest are boys.
         */

        int ageSvetlana = 22;
        int ageAndrey = 38;
        int ageNata = 47;

        if ((ageAndrey > ageSvetlana) && (ageNata > ageSvetlana)) {
            System.out.println("Andrey is older than Svetlana. Nata is older than Svetlana.");
        }

        String shelf = "books";
        String table = "catalogs";

        if (shelf.equals("books")) {
            System.out.println("There are textbooks on the shelf,");
        }

        if (table.equals("catalogs")) {
            System.out.println("there are catalogs on the table.");
        }

        int all = 100;
        int girls = 72;
        int boys = all - girls;

        if (all / 2 < girls && boys < girls && (boys + girls) == all) {
            System.out.println("Most of the children are girls. The rest are boys.");
        } else {
            System.out.println("false");
        }

        numberTask();
        /**Write as code:
         * "You can only get a driver's license when you turn 16"
         */

        int ageDrive = 16;

        if (ageDrive >= 16 && ageDrive < 150) {
            System.out.println("\"You can only get a driver's license when you turn 16\"");
        } else {
            System.out.println("false");
        }

        numberTask();
        /**Write as code:
         * "Peter does not ride the bus, but at the same time he reads a book or does not look out of the window"
         */

        boolean ridePeter = false;
        boolean readPeter = true;
        boolean lookPeter = false;

        if (ridePeter && (readPeter || lookPeter)) {
            System.out.println("false");
        } else  {
            System.out.println("\"Peter does not ride the bus, but at the same time "
                    + "he reads a book or does not look out of the window\"");
        }

        numberTask();
        /**Write as code:
         * "If you are with a friend, it's good, but when it's the other way around, it's bad."
         */

        String friends = "with friend";

        if (friends.equals("with friend")) {
            System.out.println("\"If you are with a friend, it's good\"");
        } else {
            System.out.println("\"but when it's the other way around, it's bad.\"");
        }

        numberTask();
        /**Write expressions as if-else conditions:
         * "If you are over 18, then you are an adult. Otherwise, you are a child."
         * "If the ground is dry, then there is no rain. If the ground is wet, then it is raining."
         * "If the ground is dry, then there is no rain. If the ground is wet, then it is raining.
         * Otherwise it's snowing."
         * "If there are clouds in the sky, it is raining, otherwise it is “a monkey's wedding”."
         * "If today is Saturday, then tomorrow is Sunday. If today is Friday, then yesterday was Thursday.
         * Otherwise, yesterday was not Thursday, and tomorrow is not Sunday."
         * "If a crab whistled on the mountain, then eternity has passed, otherwise you should wait farther."
         * "If you are 18 or you have finished school, then you do not have to live with your parents,
         * otherwise live with your parents."
         */
        subItemTask();

        int yourAge = 18;

        if (yourAge > 18 && yourAge < 120) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }

        subItemTask();

        String groundDry = "dry";

        if (groundDry.equals("dry")) {
            System.out.println("There is no rain");
        } else {
            System.out.println("It is raining");
        }

        subItemTask();

        String groundWet = "wet";

        if (groundDry.equals("dry")) {
            System.out.println("There is no rain");
        }
        if (groundWet.equals("wet")) {
            System.out.println("It is raining");
        } else {
            System.out.println("It's snowing");
        }

        subItemTask();

        String sky = "clouds";

        if (sky.equals("clouds")) {
            System.out.println("It is raining");
        } else {
            System.out.println("It is “a monkey's wedding\"");
        }

        subItemTask();

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

        subItemTask();

        String crab = "whistle";

        if (crab.equals("whistle")) {
            System.out.println("Eternity has passed");
        } else {
            System.out.println("Wait farther");
        }

        subItemTask();

        int ageTeenager = 18;
        String school = "finished";

        if (ageTeenager == 18 || school.equals("finished")) {
            System.out.println("You do not have to live with your parents");
        } else {
            System.out.println("Live with your parents");
        }

        numberTask();
        /**Check the number for evenness. If the number is even, double the number, otherwise square the number.
         *
         */

        int checkNumber = 32;

        if (checkNumber % 2 == 0) {
            System.out.println(checkNumber * 2);
        } else {
            System.out.println(checkNumber * checkNumber);
        }

        numberTask();
        /**Write an algorithm for checking the age for compliance with the conditions (if-else):
         * "You can vote from the age of 18"
         * "You can drive a car from the age of 16"
         * "You can go to school from the age of 5"
         */

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

        numberTask();
        /**"Check a student's grade and performs the following actions:
         * 5 - issue a commendable letter and go to the next class
         * 4 - go to the next class
         * 3 - give a task for the summer and go to the next class
         * 2 - call parents and leave in the current class for the second year
         */

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

        numberTask();
        /**Write an algorithm for a program that checks 2 numbers.
         * The program adds numbers that are divisible by 3 without a remainder,
         * and subtracts numbers that are divisible by 5 without a remainder.
         * The program multiplies numbers that are divisible by 2 without a remainder,
         * but if at least one number is negative, the program multiplies the result of the previous action by (-1).
         * If the numbers have not passed any checks, the program prints an error about the impossibility
         * of performing actions.
         */

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

        numberTask();

        int k = 5;
        int l = 10;
        int m = 15;

        compareMethod(k, l);
        compareMethod(k, m);
        compareMethod(l, m);
        compareMethod(m, k);

        numberTask();
        /**Use the method and parameters.
         * Create the variables apple and student and assign them the values 40 and 6 respectively.
         * Print expression:
         * If ... apples(s) are divided by ... students, then each student will receive ... apples(a),
         * and ... apples(s) will remain with the teacher.
         * Print the same expression with the values 100 and 21.
         */

        int apple = 100;
        int student = 21;

        taskApples(apple, student);

        numberTask();
        /**Write a method so that the correct declensions of words (apple or apples) are printed automatically,
         * depending on the parameter values.
         * Print expression with parameters:
         * apple = 42, 55, 1, 10
         * student = 42, 5, 2, 0
         */

        countResult(42, 42);
        countResult(55, 5);
        countResult(1, 2);
        countResult(13, 0);

        numberTask();
        /**Write a method that takes a temperature parameter in Celsius
         * and prints out the temperature result in Celsius and Fahrenheit.
         */

        tempCF(36.6);
        tempCF(37);

        numberTask();

        System.out.println("_________________________");
        System.out.println("| " + "int min " + "| " + getMinValue(24) + " |");
        System.out.println("| " + "int max " + "| " + getMaxValue(24) + "  |");
        System.out.println("| " + "i ^ 2   "  + "| " + getPowValue(24) + "       |");
        System.out.println("_________________________");

        numberTask();

        /**Write a test that validates (verifies that it works) your code from task #10.
         * Test data - 2, 5, 0.
         */

        task10Validate(-2);
        assertIntegerResult(-4, -4);
        task10Validate(5);
        assertIntegerResult(25, 25);
        task10Validate(0);
        assertIntegerResult(0, 0);

        numberTask();
        /**Write a test that validates your code from task #11.
         *
         */

        assertIntegerResult(3,15);
        assertIntegerResult(20,20);
        assertIntegerResult(38,138);
        assertIntegerResult(35, 35);








































    }
}

