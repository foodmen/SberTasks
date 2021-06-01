package com.company.part5Aloritmicus;

import java.util.Scanner;

/*Нули факториала
На сколько нулей оканчивается число n!=1⋅2⋅3⋅…⋅n? n≤ 10^6.*/

public class Ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalZero = 0;
        for (int power = 1; n >= Math.pow(5, power); power++) {
            totalZero = totalZero + getQuantityZero(n, Math.pow(5, power));
        }
        System.out.println(totalZero);
    }
    public static int getQuantityZero(double n, double digit) {
        int quantityZero = 0;
        while (n - digit >= 0) {
            quantityZero++;
            n = n - digit;
        }
        return quantityZero;
    }
}
