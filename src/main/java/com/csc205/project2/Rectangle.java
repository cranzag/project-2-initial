// Prompt given to ChatGPT for the surfaceArea() and volume() methods:
//
// Create a Java class called "Rectangle" that includes the method "surfaceArea()" for calculating surface area and the
// method "volume()" for calculating volume. Use the variable "width" for the width of the cube, the variable "height"
// for the height of the cube, and the variable "length" for the length of the cube
//

package com.csc205.project2;

public class Rectangle extends Shape {

    private double length;
    private double width;
    private double height;

    public Rectangle() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double v, double w, double x) {
        super();
        this.length = v;
        this.width = w;
        this.height = x;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate surface area
    public double surfaceArea() {
        // Formula for surface area of a rectangular cuboid
        double surfaceArea = 2 * ((length * width) + (width * height) + (height * length));
        return surfaceArea;
    }

    // Method to calculate volume
    public double volume() {
        // Formula for volume of a rectangular cuboid
        double volume = length * width * height;
        return volume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle {");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
