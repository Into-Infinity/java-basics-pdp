package task11;

public class ArrayExceptionDemo {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
