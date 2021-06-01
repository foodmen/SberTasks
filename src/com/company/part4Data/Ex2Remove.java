package com.company.part4Data;

import java.util.ArrayList;
import java.util.Scanner;

/*
Очистка данных
В статистике и анализе данных при исследовании выборки нередко отбрасывают экстремальные значения. Это
делается для борьбы с выбросами. Ваша задача — реализовать алгоритм, отбрасывающий заданное количество
экстремальных значений в случае, если выборочная дисперсия превышает указанное значение. Относительный
порядок элементов выборки после удаления части значений должен сохраниться. Удалять следует одинаковое
количество наибольших и наименьших элементов выборки. Гарантируется, что количество удаляемых элементов
четное. Гарантируется, что выборка состоит из различных чисел.
Примечание.
Если выборочная дисперсия не превосходит указанное значение, то достаточно вывести исходный массив.
В противном случае удаление производится только один раз. То есть после удаления t элементов заново
расчитывать и проверять выборочную дисперсию не нужно.

Формат ввода
В первой строке содержится три числа n,t,D 1≤n≤10^3 — размер выборки,
0≤t≤n— число отбрасываемых значений,
0≤D≤10^9 — допустимая выборочная дисперсия
Во второй строке содержится n целых чисел, записанных через пробел -10^5 < a_i < 10^5 — выборка

Формат вывода
Элементы выборки, оставшиеся после удаления и записанные через пробел*/

public class Ex2Remove {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Integer> selection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            selection.add(sc.nextInt());
        }
        if (getSampleVariance(selection) > d) {
            removeExtremeValues(t, selection);
        }
        for (int i = 0; i < selection.size(); i++) {
            System.out.print(selection.get(i) + " ");
        }
    }

    private static void removeExtremeValues(int t, ArrayList<Integer> selection) {
        for (int i = 0; i < t / 2; i++) {
            int max = selection.get(0);
            int min = selection.get(0);
            int indexMax = 0;
            int indexMin = 0;
            for (int j = 1; j < selection.size(); j++) {
                if (selection.get(j) >= max) {
                    max = selection.get(j);
                    indexMax = j;
                }
            }
            selection.remove(indexMax);
            for (int j = 1; j < selection.size(); j++) {
                if (selection.get(j) <= min) {
                    min = selection.get(j);
                    indexMin = j;
                }
            }
            selection.remove(indexMin);
        }
    }

    private static double getSampleVariance(ArrayList<Integer> selection) {
        double sum = 0;
        double averageValue;
        double total = 0;
        int n = selection.size();
        for (int i = 0; i < n; i++) {
            sum = sum + selection.get(i);
        }
        averageValue = sum / n;
        for (int i = 0; i < n; i++) {
            sum = Math.pow(selection.get(i) - averageValue, 2);
            total = total + sum;
        }
        total = total / n;
        return total;
    }
}
