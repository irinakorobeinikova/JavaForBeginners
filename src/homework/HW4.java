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
        }
        else {
            System.out.println("false");
        }
        space();

        numberTask();

        boolean ridePeter = false;
        boolean readPeter = true;
        boolean lookPeter = false;
        if (ridePeter && (readPeter || lookPeter)) {
            System.out.println("false");
        }
        else  {
            System.out.println("\"Peter does not ride the bus, but at the same time "
                    + "he reads a book or does not look out the window\"");
        }
        space();




















    }
}

