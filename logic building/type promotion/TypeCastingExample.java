public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit type casting (widening conversion)
        int intNum = 100;
        double doubleNum = intNum; // int to double

        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intNum);
        System.out.println("double value: " + doubleNum);

        // Explicit type casting (narrowing conversion)
        double anotherDoubleNum = 9.78;
        int anotherIntNum = (int) anotherDoubleNum; // double to int

        System.out.println("Explicit Type Casting:");
        System.out.println("double value: " + anotherDoubleNum);
        System.out.println("int value: " + anotherIntNum);

        // Explicit type casting with data loss
        double largeDouble = 1000.99;
        byte byteNum = (byte) largeDouble; // double to byte, potential data loss

        System.out.println("Type Casting with Data Loss:");
        System.out.println("double value: " + largeDouble);
        System.out.println("byte value: " + byteNum);
    }
}
