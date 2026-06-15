package shapes;

public class Rectangle extends Shape {

    private double width, length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "[ Rectangle ]\n" + super.toString()
                + "\nWidth : " + width
                + "\nLength: " + length
                + String.format("\nArea      : %.2f\nPerimeter : %.2f", getArea(), getPerimeter());
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
