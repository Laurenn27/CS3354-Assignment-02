package edu.txst.assignment2;

/**
 * The triangle and calculating its area.
 */
public class Triangle implements Shape {

    private double base;
    private double height;

    /**
     * Creates a triangle with the given base and height.
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the triangle.
     * @return the area of the triangle
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Returns the name of the shape.
     * @return the shape name
     */
    @Override
    public String getClassName() {
        return "Triangle";
    }

    /**
     * Returns information about the triangle.
     * @return a description of the triangle
     */
    @Override
    public String toString() {
        return "Triangle (base: " + base + ", height: " + height + ")";
    }
}
