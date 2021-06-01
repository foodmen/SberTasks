package com.company.part5Aloritmicus;

import java.util.Scanner;

/*Суммы дробей
Даны четыре целых положительных числа a, b, c и d. Сложить две рациональные дроби a/b и c/d,
а их результат представить в виде несократимой дроби m/n. Вывести числа m и n. 0<a,b,c,d≤1000.*/

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int multiplication1 = b * c;
        int multiplication2 = a * d;
        int m = multiplication1 + multiplication2;
        int n = b * d;
        for (int i = m; i > 1; i--) {
            if (m % i == 0 && n % i == 0) {
                m = m / i;
                n = n / i;
            }
        }
        System.out.print(m + " ");
        System.out.print(n);
    }
}
