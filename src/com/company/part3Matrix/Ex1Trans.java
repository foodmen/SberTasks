package com.company.part3Matrix;

import java.util.Scanner;

/*Транспонирование
На вход подается матрица размерности k⋅n. Выведите транспонированную матрицу.
Формат ввода
В первой строке через пробел даны два числа k, n, 1≤k, n≤100
Далее даны k строк, в каждой из которых через пробел записаны nn целых чисел a_{ij}, -10^6 ≤a_{ij}≤10^6
Формат вывода
Необходимо вывести n строк, в каждой из которых через пробел записаны k целых чисел -- транспонированная матрица*/

public class Ex1Trans {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] array = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
