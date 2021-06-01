package com.company.part2Iterat;

import java.util.Scanner;

/*Цепная дробь
Необходимо для данного nn вывести значение конечной цепной дроби
Округление производится до десяти знаков после запятой (если в числе меньше знаков после запятой, дописывать
нули в конце не нужно).
Примечание
Для округления можно воспользоваться методом String.format()
Формат ввода
В единственной строке ввода дано число 0≤n≤100
Формат вывода
Необходимо вывести единственное число -- значение дроби, округленное до десяти знаков после запятой*/

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = 1;
        result = result + getFraction(n, 0);
        System.out.printf("%.10f", result);
    }
    public static double getFraction(int n, int i) {
        if (i < n) {
            return (1 / (2 * i + 3 + getFraction(n, ++i)));
        } else {
            return 0;
        }
    }
}
