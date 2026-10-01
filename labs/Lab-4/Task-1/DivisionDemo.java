/**
 * Divides two numbers and survives a zero denominator.
 */
public class DivisionDemo {

    /**
     * Divides two numbers.
     *
     * @param numerator the number being divided
     * @param denominator the number to divide by
     * @return the quotient
     */
    public static int safeDivide(int numerator, int denominator) {
        return numerator / denominator;
    }

    /**
     * Divides once safely, then once by zero, to show the catch working.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + safeDivide(10, 2));
            System.out.println("Result: " + safeDivide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}
