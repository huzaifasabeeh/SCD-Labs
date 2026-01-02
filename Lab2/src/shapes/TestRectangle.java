package shapes;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setWidth(5);

        System.out.println("Length    : " + r.getLength());
        System.out.println("Width     : " + r.getWidth());
        System.out.println("Area      : " + r.area());
        System.out.println("Perimeter : " + r.perimeter());
    }
}
