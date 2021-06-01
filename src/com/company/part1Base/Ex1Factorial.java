package com.company.part1Base;

import java.util.Scanner;

/*Факториал
Вычислить значение n! при заданном nn. Может быть использован любой подход (рекурсия, цикл).
Формат ввода
Число n, 0≤n≤20.
Формат вывода
факториал числа n.*/

public class Ex1Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial = factorial * i;
        }
        System.out.print(factorial);
    }
}
