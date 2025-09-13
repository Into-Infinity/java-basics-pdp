package task08;

// Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.
public class PalindromeFinder {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {

        int[] numbers = {123, 121, 454, 33, 789, 11};

        int count = 0;
        for (int num : numbers) {
            if (isPalindrome(num)) {
                count++;
                System.out.println(count + " palindrome found: " + num);
                if (count == 2) {
                    break;
                }
            }
        }

        if (count < 2) {
            System.out.println("Less than two palindromes found.");
        }
    }
}
