package lab7;

public class Main {

    // Generic method for subtraction
    public static <T extends Number> void subtractArray(T[] array) {

        System.out.print("Result: [ ");

        for (int i = 0; i < array.length - 1; i++) {
            double result = array[i].doubleValue() - array[i + 1].doubleValue();
            System.out.print(result);

            if (i < array.length - 2) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 7, 3, 9, 19};
        Double[] doubleArray = {10.5, 5.5, 2.0, 1.0};
        Float[] floatArray = {8.5f, 3.5f, 1.5f};

        System.out.println("Integer Array:");
        subtractArray(intArray);

        System.out.println("\nDouble Array:");
        subtractArray(doubleArray);

        System.out.println("\nFloat Array:");
        subtractArray(floatArray);
    }
}
