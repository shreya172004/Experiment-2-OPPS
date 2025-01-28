public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;

        // Loop through numbers from 2 to 1000
        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("Total number of prime numbers between 1 and 1000: " + count);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }

        // Check for factors from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true; // num is prime
    }
}
