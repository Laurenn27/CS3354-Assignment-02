package edu.txst.assignment2;

/**
 * a circle and calculates its area.
 */
public class Circle implements Shape {

    private double radius;

    /**
     * makes a circle with the given radius.
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return the area of the circle
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the name of the shape.
     * @return the shape name
     */
    @Override
    public String getClassName() {
        return "Circle";
    }

    /**
     * Returns information about the circle.
     * @return a description of the circle
     */
    @Override
    public String toString() {
        return "Circle (radius: " + radius + ")";
    }
}