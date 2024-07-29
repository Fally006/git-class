public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 15, 20, 3};

        int largest = numbers[0]; // Assume the first element is the largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update largest if a larger number is found
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}