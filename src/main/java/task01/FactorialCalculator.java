package task01;

import java.util.Scanner;

// Написать метод, который вычисляет факториал введенного целого числа
public class FactorialCalculator {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.print("The factorial of " + n + " is " + result);
    }
}