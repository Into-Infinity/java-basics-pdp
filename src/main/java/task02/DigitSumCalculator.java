package task02;

import java.util.Scanner;

// Посчитать сумму цифр заданного числа
public class DigitSumCalculator {

    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = sumOfDigits(n);
        System.out.println("The sum of digits of " + n + " is " + result);
        sc.close();
    }
}