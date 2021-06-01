package com.company.part2Iterat;

import java.util.Scanner;

/*Вычисление суммы
Необходимо для данного N вычислить значение суммы ...
Формат ввода
В единственной строке ввода дано число 0≤N≤10
Формат вывода
Необходимо вывести единственное число -- значение суммы, округленное до десяти знаков после запятой
Примечание
Для округления можно воспользоваться методом String.format()*/

public class Ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double res;
        double factorial;
        double exp;
        double total = 0;
        for (int x = 1; x <= 5; x++) {
            res = 0;
            for (int k = 0; k <= N; k++) {
                factorial = getFactorial(k);
                exp = Math.pow(-1, (k + 1)) * Math.pow(x, (2 * k + 1)) / (factorial * (2 * k + 1));
                res = res + exp;
            }
            total = total + res;
        }
        System.out.printf("%.10f", total);
    }

    private static double getFactorial(int k) {
        int factorial = 1;
        for (int i = 1; i <= k; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
