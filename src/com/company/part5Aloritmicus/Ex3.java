package com.company.part5Aloritmicus;

import java.util.Scanner;

/*Площадь многоугольника
Вычислить площадь выпуклого n-угольника, заданного координатами своих вершин. Вначале вводится количество вершин,
затем последовательно целочисленные координаты всех вершин в порядке обхода по часовой стрелке.
n < 1000, -10000 < координаты < 10000.
Указание. Для вычисления площади n-угольника можно посчитать сумму площадей трапеций под каждой стороной многоугольника.*/

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point[] points = new Point[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            Point point = new Point();
            point.x = scanner.nextInt();
            point.y = scanner.nextInt();
            points[i] = point;
        }
        sum = sum + points[0].x * points[n - 1].y - points[n - 1].x * points[0].y;
        for (int i = 1; i < n; i++) {
            sum = sum + points[i].x * points[i - 1].y - points[i - 1].x * points[i].y;
        }
        System.out.println(sum / 2);
    }
}

class Point {
    int x;
    int y;
}
