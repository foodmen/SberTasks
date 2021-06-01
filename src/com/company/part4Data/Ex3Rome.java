package com.company.part4Data;

import java.util.Scanner;

/*По неизвестным причинам часть данных для обработки записана при помощи римских цифр. Ваша задача реализовать механизм,
 конвертирующий римские цифры в арабские.
 Как правило, последовательность символов записывается от большего к меньшему слева направо. Но в некоторых
 случаях меньшее число записывается слева от большего, что означает вычитание меньшего из большего.
 Существует три правила, описывающие, в каких случаях применяется вычитание.
I может находиться перед V (5) и X (10), что означает 4 и 9.
X может находиться перед L (50) и C (100), что означает 40 и 90.
C может находиться перед D (500) и M (1000), что означает 400 и 900.
Например, IX означает 9, а  XCIX — 99
Формат ввода
В единственной строке ввода задана корректная римская запись некоторого числа в верхнем регистре, длина
строки не более 10 символов
Формат вывода
Необходимо вывести единственное число — арабскую запись этого числа*/

public class Ex3Rome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rome = sc.nextLine();
        char[] arr = rome.toCharArray();
        int length = arr.length;
        int res = digit(arr[length - 1]);
        for (int i = 0; i < length - 1; i++) {
            if (digit(arr[i]) < digit(arr [i + 1])) {
                res = res - digit(arr[i]);
            } else {
                res = res + digit(arr[i]);
            }
        }
        System.out.println(res);
    }
    public static int digit(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
