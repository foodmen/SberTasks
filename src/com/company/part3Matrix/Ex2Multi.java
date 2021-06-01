package com.company.part3Matrix;

import java.util.Scanner;

/*Умножение на число
На вход подается матрица размерности k⋅n и число A. Умножьте матрицу на число
Формат ввода
В первой строке через пробел даны два целых числа k, n, 1≤k, n≤100
Далее даны k строк, в каждой из которых через пробел записаны nn целых чисел a_{ij}, -10^6 ≤a_{ij}≤10^6
В последней строке дано целое число A, −10^6≤A≤10^6
Формат вывода
Необходимо вывести k строк, в каждой из которых через пробел записаны n целых чисел -- итоговая матрица*/

public class Ex2Multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int a = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] * a + " ");
            }
            System.out.println();
        }
    }
}
