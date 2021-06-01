package com.company.part1Base;

import java.util.Scanner;

/*Функция, заданная системой
На вход подается значение X. Вычислить Y по такой формуле: ...
Результат округлить до 2 знаков после запятой.
Примечание
Для округления можно воспользоваться методом String.format()
Формат ввода
Число x, -1000,0≤x≤1000,0
Формат вывода
Результат вычислений (число Y).*/

public class Ex2XY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;
        if (x >= -1 && x < 1)
            y = Math.sqrt(15 - x * x);
        else if (x >= 1 && x <= 2)
            y = 1 / Math.sqrt(x * x + x);
        else
            y = x * x * x;
        System.out.printf("%.2f", y);
    }
}
