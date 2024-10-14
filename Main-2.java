//veronica leal
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int max = 25; // Example provided in class

        // Create an array from 2 to max, because 1 can never be a prime
        int[] arrayMax = new int[max + 1];
        for (int i = 2; i <= max; i++) {
            arrayMax[i] = i;
        }

        // Call the sieve method 
        Sieve.sieve(arrayMax);

        // Prints the prime numbers up to the chosen max value
        System.out.print("The prime numbers up to " + max + " are: ");
        for (int num : arrayMax) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Call the goldbach method 
        Goldbach.goldbach(arrayMax);
    }
}

class Sieve {

    public static void sieve(int[] array) {
        int max = array.length - 1;

        
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        if (max > 1) isPrime[1] = false;

        // Sieve of Eratosthenes algorithm starting from 2
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Mark non-prime numbers as 0 in the input array starting from 2
        for (int i = 2; i <= max; i++) {
            if (!isPrime[i]) {
                array[i] = 0;
            }
        }
    }
}

class Goldbach {

    // Method to find Goldbach partitions for even numbers up to max
    public static void goldbach(int[] array) {
        int max = array.length - 1;

        // Step 1: Find all prime numbers up to max using the input array starting from 2
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (array[i] != 0) {
                primes.add(i);
            }
        }

        // Step 2: Iterate over even numbers from 4 to max
        for (int n = 4; n <= max; n += 2) {
            System.out.print("Goldbach partitions for " + n + ": ");

            // Step 3: Find Goldbach partitions for current even number n
            boolean foundPartition = false;
            for (int i : primes) {
                int complement = n - i;
                if (complement < i) break; // No need to check pairs where complement < i

                // Check if complement is prime using the input array starting from 2
                if (array[complement] != 0) {
                    System.out.print("(" + i + ", " + complement + ") ");
                    foundPartition = true;
                }
            }

            if (!foundPartition) {
                System.out.print("No partitions found");
            }

            System.out.println();
        }
    }
}
