package com.company.part1Base;

import java.util.Scanner;

/*Вклады
В банке N принята сложная схема годовых процентных ставок по вкладу. Размер процентов зависит от внесенной
суммы по такой формуле...
Помогите пользователю рассчитать прибыль, которую он получит через год. Размер прибыли округлить до копеек
(2 знаков после запятой).
Примечание
Для округления можно воспользоваться методом String.format().
Формат ввода
Целочисленная сумма вклада x, 0≤x≤10^9
Формат вывода
Размер прибыли.*/

public class Ex3ProfitXY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double profit;
        if (x <= 1000) {
            profit = 0;
        } else if (x > 1000 && x <= 1000000) {
            profit = Math.sqrt((x - 1) / 2);
        } else {
            profit = x * ((1 / (double)x) + 0.2);
        }
        System.out.printf("%.2f", profit);
    }
}
