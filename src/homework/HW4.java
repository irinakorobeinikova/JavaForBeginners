package homework;

public class HW4 {

    public static int number = 1;

    public static void numberTask() {

        System.out.println("\u001B[33m" + "*****************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "*****************" + "\u001B[0m");

        number++;
        System.out.println();
    }

    public static void main(String[] args){

        numberTask();

        numberTask();




    }
}

