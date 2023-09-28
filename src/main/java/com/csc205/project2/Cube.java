// Prompt given to ChatGPT for the surfaceArea() and volume() methods:
//
// Create a Java class called "Cube" that includes the method "surfaceArea()" for calculating surface area and the
// method "volume()" for calculating volume. Use the variable "width" for the width of the cube
//

package com.csc205.project2;

public class Cube extends Shape {

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getwidth() {
        return width;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    // Method to calculate and return the surface area of the cube
    public double surfaceArea() {
        // Surface area of a cube = 6 * (side length)^2
        return 6 * Math.pow(width, 2);
    }

    // Method to calculate and return the volume of the cube
    public double volume() {
        // Volume of a cube = (side length)^3
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
