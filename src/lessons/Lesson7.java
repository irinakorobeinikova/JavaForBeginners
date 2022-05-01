package lessons;

public class Lesson7 {

    public static void numberTask(int number) {

        System.out.println();
        System.out.println("\u001B[33m" + "**************************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "**************************" + "\u001B[0m");

        number++;
        System.out.println();
    }

    public static void main(String[] args) {

        numberTask(1);

        String catName = "Lucky";

        System.out.println(catName);

        numberTask(2);

        String[] catsNames;
        catsNames = new String[8];
        catsNames[4] = "Lucky";
        catsNames[2] = "Smokey";
        catsNames[6] = "Lucky";

        System.out.println(catsNames);
        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);
        System.out.println(catsNames[4]);

        numberTask(3);

        int[] catsAges = new int[8];

        System.out.println(catsAges);
        System.out.println(catsAges[2]);

        numberTask(4);

        for (int i = 0; i < 8; i++) {
            System.out.print(catsNames[i] + " ");
        }

        numberTask(5);

        for (int i = 0; i < 8; i ++) {
            if (catsNames[i] == "Lucky") {
                System.out.println(catsNames[i]);
            }
        }

        numberTask(6);

        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Lucky") {
                System.out.println(i);
            }
        }
    }
}
