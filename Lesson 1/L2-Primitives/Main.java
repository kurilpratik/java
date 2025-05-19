public class Main {
    public static void main(String[] args) {
        // Primitive data types are that cannot be broken into other data type

        // 4 bytes
        int rollno = 64;

        // 2 bytes
        char letter = 'r';

        // 4 bytes
        // All decimal values by default are stroed in double, if we want to store them in float we have to add f at the end
        float marks = 98.5f;

        // 8 bytes
        double largeDecimalNumbers = 451675.4612;

        // 8 bytes
        // integer by default is stored in int, if we want to store it in long, we add L at the end
        long largeInteger = 45641651L;

        // 1 byte
        boolean check = true; 

        // String is not primitive
        String name = "Pratik";

        // All these data types also have a class representation k/a Wrapper Classes, it gives additional functionalities.
        Integer rno = 64;
        rno.hashCode();
    }
}
