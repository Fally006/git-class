public class ArraySum {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate sum of elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Output the sum
        System.out.println("The sum of elements in the array is: " + sum);
    }
}