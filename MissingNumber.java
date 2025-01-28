public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 2, 4}; // Given array
        int N = 6; // The length of the full range, including the missing number

        int missingNumber = findMissingNumber(numbers, N);
        System.out.println("The missing number is: " + missingNumber);
    }

    // Function to find the missing number
    public static int findMissingNumber(int[] arr, int N) {
        int totalSum = N * (N + 1) / 2; // Sum of first N numbers
        int arraySum = 0;

        // Calculate the sum of elements in the given array
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }
}
