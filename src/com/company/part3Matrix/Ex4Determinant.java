package com.company.part3Matrix;

import java.util.Scanner;

/*Определитель матрицы
На вход подается матрица размерности k⋅k. Выведите ее определитель
Формат ввода
В первой строке дано целое число k, 1≤k≤5
Далее даны k строк, в каждой из которых через пробел записаны k целых чисел a_{ij}, a_{ij}, -100 ≤a_{ij}≤100
Формат вывода
Необходимо вывести единственное целое число -- определитель матрицы*/

public class Ex4Determinant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double determinant = 1;
        double division;
        double[][] matrix = new double[k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        for (int x = 1; x < k; x++) {
            for (int i = x; i < k; i++) {
                if (matrix[x - 1][x - 1] != 0) {
                    division = matrix[i][x - 1] / matrix[x - 1][x - 1];
                }
                else {
                    division = 1;
                }
                for (int j = x - 1; j < k; j++) {
                    matrix[i][j] = matrix[i][j] - matrix[x - 1][j] * division;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            determinant = determinant * matrix[i][i];
        }
        System.out.printf("%.0f", determinant);
    }
}
