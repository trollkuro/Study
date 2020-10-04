/*
* Задача:
* Любимая математическая гипотеза разработчицы Саши - гипотеза Коллаца.
* Возьмем натуральное число n. Если оно четное, то разделим его на 2, иначе умножим на 3 и прибавим 1 (получаем 3n+1).
* Гипотеза заключается в том, что для любого натурального числа n в процессе указанных преобразований мы получим единицу.
* Дальше процесс цикличен: (1, 4, 2, 1).
* Определим p(n) как количество шагов, за которое число, при указанных преобразованиях, достигнет 1.
* Например, p(5) = 5 (16, 8, 4, 2, 1)
* p(3) = 7 (10, 5, 16, 8, 4, 2, 1).
*
* Саша решила посмотреть на интервальные суммы p(n) и просит помочь ей написать программу.
* Входные данные: Два числа, L и R (L<=R; 1 <= L <= 1000000; R-L <= 500).
* Результат работы: сумма p(i) для всех L<=i<=R.
*
* Пример: при подаче на вход программы значений 2 и 5, результат будет 15
*
* */

import java.util.Scanner;

public class Collatz {
    static int l;
    static int r;
    static int p_sum = 0;

    /* считываем числа со сканнера */
    public void readNumber () {
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        r = in.nextInt();
        while (!isValid(l,r)) {
            System.out.println("Put L and R again");
            l = in.nextInt();
            r = in.nextInt();
        }

    }

    /* метод для проверки валидности введеной пары чисел */
    public static boolean isValid (int a, int b) {
        int c1 = 10;
        int c2 = 6;
        if (a <= b && 1 <= a && a <= Math.pow(c1, c2) && b - a <= 500) {
            return true;
        } else {
            System.out.println("Your numbers are not valid!");
            return false;}
    }

    /* считаем количество шагов для приведения одного числа к еденице */
    public static int getStepsCountForCollatz (int a) {
        int counter = 0;
        while (a != 1) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = a * 3 + 1;
            }
            counter++;
        }
        return counter;
    }


    /* считаем общее количество шагов для КАЖДОГО числа в пределах диапазона L и R */
    public static void getCommonSumOfSteps() {
        for (int i = l; i <= r; i++){
            p_sum += getStepsCountForCollatz(i);
        }
        System.out.println(p_sum);
    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        collatz.readNumber();
        getCommonSumOfSteps();
    }

}
