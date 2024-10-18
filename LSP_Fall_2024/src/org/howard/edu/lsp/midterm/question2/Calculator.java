package org.howard.edu.lsp.midterm.question2;

/**
 * Utility class that handles sum operations for different input types.
 * It can sum integers, doubles, and arrays of integers.
 */
public class Calculator {

    /**
     * Sums two integers.
     * This method adds two int values and returns their sum.
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int sum(int a, int b) {
        return a + b; // basic sum of two integers
    }

    /**
     * Sums two double values.
     * This method adds two double numbers and returns the result.
     * @param a the first double value
     * @param b the second double value
     * @return the sum of a and b
     */
    public static double sum(double a, double b) {
        return a + b; // adds two doubles and returns the sum
    }

    /**
     * Sums all elements in an integer array.
     * This method takes an array of integers, adds them together,
     * and returns the total sum.
     * @param numbers the array of integers
     * @return the sum of all elements in the array
     */
    public static int sum(int[] numbers) {
        int total = 0; // initialize total to 0
        for (int number : numbers) {
            total += number; // add each element in the array
        }
        return total; // return the total sum
    }
}
