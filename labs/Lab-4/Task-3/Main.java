/**
 * Finds the largest value in an array.
 */
public class Main {

    /**
     * Returns the largest number in the array.
     *
     * @param numbers the array to search
     * @return the largest value
     */
    public static int findMax(int[] numbers) {
        int maxValue = numbers[0]; // start from the first number, not 0
        for (int n : numbers) {
            if (n > maxValue) {
                maxValue = n;
            }
        }
        return maxValue;
    }

    /**
     * Runs findMax over an array of negative numbers.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        int[] numbers = {-5, -2, -9};
        System.out.println("Maximum value: " + findMax(numbers));
    }
}
