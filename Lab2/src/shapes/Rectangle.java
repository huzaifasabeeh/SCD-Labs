package shapes;

public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0)
            this.length = length;
        else
            System.out.println("Invalid Length! Must be between 0 and 20.");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0)
            this.width = width;
        else
            System.out.println("Invalid Width! Must be between 0 and 20.");
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

