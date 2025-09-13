package task07;

import java.util.Arrays;

// Вывести элементы массива в обратном порядке.
public class ArrayReversePrint {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Original array: " + Arrays.toString(arr));

        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }
}
