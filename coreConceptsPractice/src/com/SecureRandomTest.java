package com;

import java.security.SecureRandom;
import java.util.Arrays;

public class SecureRandomTest {
    public static void main(String[] args) {
        int[] test= getRandomArrayThatSumsTo100WithSize(10);
        System.out.println(Arrays.toString(test));
    }

    public static int[] getRandomArrayThatSumsTo100WithSize(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number of elements must be positive");
        }

        SecureRandom rand = new SecureRandom();
        int[] result = new int[n];
        int sum = 0;

        // Step 1: Generate n-1 random numbers in the range [0, 100 - sumSoFar]
        for (int i = 0; i < n - 1; i++) {
            int max = 100 - sum - (n - 1 - i); // leave room for at least 1 in each remaining
            int num = rand.nextInt(max + 1);
            result[i] = num;
            sum += num;
        }


        // Step 2: Set the last number so that total is 100
        result[n - 1] = 100 - sum;


        // Step 3: Shuffle to randomize order
        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(n);
            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }
        return result;
    }
}
