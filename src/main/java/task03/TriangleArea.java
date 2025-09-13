package task03;

import java.util.Scanner;

// Написать программу вычисляющую площадь треугольника по трем сторонам
public class TriangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the side c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("The area of the triangle is " + area);
        } else {
            System.out.println("Such a triangle does not exist.");
        }

        sc.close();
    }
}
