package homework;

public class HW2 {

    public static void main(String[] args){

//Task 11 Создать целочисленные переменные k, l, m и присвоить им значения на ваше усмотрение.
        int k = 3;
        int l = 8;
        int m = 25;
        String line = "______________________________________________________________________________________________";

//Task 12 Вывести значения переменных в столбик.
        System.out.println("Task 12");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);

        //Task 13 Вывести значения переменных в строку.
        System.out.println("Task 13");

        System.out.print(k);
        System.out.print(l);
        System.out.println(m);
        System.out.println(line);

        //Task 14 Используя конкатенацию, вывести значения переменных в строку через запятую.
        System.out.println("Task 14");

        System.out.println(k + ", " + l + ", " + m);
        System.out.println(line);

        //Task 15 Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
        //Например, должно быть распечатано:
        // int a = 5;
        // или a = 5
        System.out.println("Task 15");

        System.out.println("int k = " + k);
        System.out.println("int l = " + l);
        System.out.println("int m = " + m);
        System.out.println(line);

        //Task 16 Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
        //Sum of k and l = …
        //k * m = …
        //Разность переменных l и m = …
        System.out.println("Task 16");

        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + (k * m));
        System.out.println("Subtract m from l = " + (l - m));
        System.out.println(line);

        //Task 17 Распечатать следующие выражения:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …
        System.out.println("Task 17");

        System.out.println("The result of dividing k by l = " + (k / l) + ", "
                + "and the remainder of the division equals " + (k % l) + ".");

        System.out.println("The result of dividing k by m = " + (k / m) + ", "
                + "and the remainder of the division equals " + (k % m) + ".");

        System.out.println("The result of dividing k by l = " + (l / m) + ", "
                + "and the remainder of the division equals " + (l % m) + ".");

        System.out.println("The result of dividing k by l = " + (m / k) + ", "
                + "and the remainder of the division equals " + (m % k) + ".");
        System.out.println(line);

        //Task 18 Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно.
        // Распечатать выражение:
        //Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        //Распечатать это же выражение со значениями 100 и 21.
        System.out.println("Task 18");

        int apple = 40;
        int student = 6;

        System.out.println("If " + apple + " apples are divided by " + student + " students, then each student " +
                "will receive " + (apple / student) + " apples, and " + (apple % student) + " apples will remain for the teacher.");

        int apple2 = 100;
        int student2 = 21;

        System.out.println("If " + apple2 + " apples are divided by " + student2 + " students, then each student " +
                "will receive " + apple2 / student2 + " apples, and " + (apple2 % student2) + " apples will " +
                "remain for the teacher.");
        System.out.println(line);

        //Task 19 Распечатать вычисления и итоговый результат:
        //Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …
        System.out.println("Task 19");

        int sumKLM = k + l + m;
        int sumLKM = l + k + m;
        sumKLM--;
        m++;

        System.out.println("Sum of k, l, m++ and sumKLM-- = " + (k + l + m + sumKLM) + "," + " but the difference " +
                        "between m++ and sumLKM = " + (m - sumLKM) + ".");
        System.out.println(line);

        //Task 20 Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.
        System.out.println("Task 20");

        System.out.println(48 % 8);
        System.out.println(48 % 2);
        System.out.println(8 % 2);

        System.out.println(47 % 2);
        System.out.println(49 % 2);
        System.out.println(line);

        //Task 21
        System.out.println("Task 21");

//        int x = 2;
//        int y = 3;
//        //int a = k;
//        //int b = l;
//        //int c = m;
//        int d = y - x;
//
//        System.out.println((x + 3) * (x + 3));
//







    }
}
