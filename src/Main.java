

public class Main {
    public static void main(String[] args) {

        // Проверяемые числа
        float a = 2.6f;
        float b = 12.6f;

        // Заданное число
        int n = 12;

        if (a == n || b == n)
        {
            System.out.println("Заданное число не должно быть равно проверяемому!");
            return;
        }

        if (a > n || b > n)
        {
            System.out.println("Проверяемые числа не должны быть больше заданного!");
            return;
        }

        float d1 = n - a;
        float d2 = n - b;
        boolean bb = (d1 > d2);
        if (bb)
            System.out.println("Число b ближе к заданному, чем число a");
        else if (d1 ==  d2)
            System.out.println("Оба проверяемых числа отстоят от заданнного одинаково");
        else System.out.println("Число a ближе к заданному, чем число b");


    }
}