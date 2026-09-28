/**
 * Totals and averages a basket of prices.
 */
public class PriceUtils {

    /**
     * Returns the sum of a list of item prices.
     *
     * @param prices the item prices
     * @return the total of all prices
     */
    public static double total(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price; // accumulate running total
        }
        return sum;
    }

    /**
     * Returns the average of a list of item prices.
     *
     * @param prices the item prices
     * @return the mean price
     */
    public static double average(double[] prices) {
        return total(prices) / prices.length;
    }

    /**
     * Prints the total and the average of a sample basket.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        double[] basket = {12.50, 7.25, 19.99, 4.00};
        System.out.printf("Total: %.2f%n", total(basket));
        System.out.printf("Average: %.2f%n", average(basket));
    }
}
