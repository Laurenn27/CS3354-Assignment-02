package edu.txst.assignment2;

/**
 * the square and calculating its area.
 */
public class Square implements Shape {

    private double side;

    /**
     * Creates a square with the given side length.
     * @param side the length of each side
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of the square.
     * @return the area of the square
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * Returns the name of the shape.
     * @return the shape name
     */
    @Override
    public String getClassName() {
        return "Square";
    }

    /**
     * Returns information about the square.
     * @return a description of the square
     */
    @Override
    public String toString() {
        return "Square (side: " + side + ")";
    }
}
