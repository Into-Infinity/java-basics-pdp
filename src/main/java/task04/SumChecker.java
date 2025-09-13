package task04;

import java.util.Scanner;

// Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
// от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
public class SumChecker {

    public static boolean isSumInRange(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        boolean result = isSumInRange(num1, num2);
        System.out.println("Is the sum in range 10-20? " + result);

        sc.close();
    }
}