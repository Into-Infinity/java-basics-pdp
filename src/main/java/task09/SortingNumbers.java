package task09;

import java.util.Arrays;

// Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
public class SortingNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 66, 333, 4444, 5, 22};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                int len1 = Integer.toString(numbers[j]).length();
                int len2 = Integer.toString(numbers[j + 1]).length();

                if (len1 > len2 || (len1 == len2 && numbers[j] > numbers[j + 1])) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sort by ascending : " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                int len1 = Integer.toString(numbers[j]).length();
                int len2 = Integer.toString(numbers[j + 1]).length();

                if (len1 < len2 || (len1 == len2 && numbers[j] < numbers[j + 1])) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sort by descending: " + Arrays.toString(numbers));
    }
}
