package task16;

// Дано три разных целых числа.
// Реализовать лямбда-выражение, которое находит наибольшее из этих трех чисел и выводит в консоль.
public class MaxOfThree {

    @FunctionalInterface
    interface LargestOfThreeFunction {
        int apply(int a, int b, int c);
    }

    public static void main(String[] args) {
        LargestOfThreeFunction largest = (a, b, c) -> Math.max(a, Math.max(b, c));
        System.out.println("Наибольшее число: " + largest.apply(10, 19, 5));
    }
}
