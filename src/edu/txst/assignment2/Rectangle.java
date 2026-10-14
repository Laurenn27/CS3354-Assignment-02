package edu.txst.assignment2;

/**
 * The rectangle and calculating its area.
 */
public class Rectangle implements Shape {

    private double width;
    private double height;

    /**
     * Creates a rectangle with the given width and height.
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     * @return the area of the rectangle
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Returns the name of the shape.
     * @return the shape name
     */
    @Override
    public String getClassName() {
        return "Rectangle";
    }

    /**
     * Returns information about the rectangle.
     * @return a description of the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle (width: " + width + ", height: " + height + ")";
    }
}