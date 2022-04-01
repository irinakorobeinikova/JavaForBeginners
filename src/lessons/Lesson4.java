7+8//78/8//87package lessons;

public class Lesson4 {

    public static void main(String[] args){

        int n = 0;

        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println(n);





    }
}
