package com.company.part3Matrix;

import java.util.Scanner;

/*Перемножение матриц
На вход подаются две матрицы размера k⋅n и n⋅d соответственно. Перемножьте матрицы
Формат ввода
В первой строке через пробел даны три целых числа k, n, d, 1≤k,n,d≤100
Далее даны k строк, в каждой из которых через пробел записаны nn целых чисел a_{ij}, -10^6 ≤a_{ij}≤10^6 — первая матрица
Далее даны n строк, в каждой из которых через пробел записаны dd целых чисел b_{ij}, b_{ij}, -10^6 ≤b_{ij}≤10^6 — вторая матрица
Формат вывода
Необходимо вывести k строк, в каждой из которых через пробел записаны d целых чисел -- итоговая матрица*/

public class Ex3MultiMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        long[][] matrix1 = new long[k][n];
        long[][] matrix2 = new long[n][d];
        long[][] matrixTotal = new long[k][d];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextLong();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                matrix2[i][j] = sc.nextLong();
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < d; j++) {
                matrixTotal[i][j] = 0;
                for (int l = 0; l < n; l++) {
                    matrixTotal[i][j] = matrixTotal[i][j] + matrix1[i][l] * matrix2[l][j];
                }
                System.out.print(matrixTotal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
