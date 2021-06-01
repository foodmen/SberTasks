package com.company.part4Data;

import java.util.Scanner;

/*Поиск простых чисел
Простые числа играют важную роль в криптографии. Например, трудность факторизации больших чисел привела к разработке
первого эффективного метода криптографии с открытым ключом. Ваша задача реализовать алгоритм, подсчитывающий количество
простых чисел в массиве.

Формат ввода
В первой строке содержится единственное число 1≤n≤1000 — размер выборки
Во второй строке содержится nn целых чисел a_i 2≤a_i≤10^12 — выборка

Формат вывода
Необходимо вывести единственное число — количество простых чисел в выборке*/

public class Ex1Digit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int total = 0;
        long[] array = new long[quantity];
        for (int i = 0; i < quantity; i++) {
            array[i] = scanner.nextLong();
        }
        for (int i = 0; i < quantity; i++) {
            if (isPrimeNumber(array[i]))
                total++;
        }
        System.out.print(total);
    }
    public static boolean isPrimeNumber(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
