/**
 * Works out the area of a rectangle.
 */
public class AreaCalculator {

    /**
     * Returns the area of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area
     */
    public static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    /**
     * Prints the area of a few rectangles.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Area of 6 x 4: " + calculateArea(6, 4));
        System.out.println("Area of 12 x 5: " + calculateArea(12, 5));
    }
}
