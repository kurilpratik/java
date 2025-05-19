
import java.util.Scanner;


public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.err.println(num);

        // Conditions for Typecasting
        // 1. The 2 types should be compatible
        // 2. Destination type should be greater than the source type

        // Typecasting
        int p = (int)67.5f;
        System.err.println(p);

        // Automatic type promotions in expressions
        int a = 257;
        byte b = (byte)a;
        System.err.println(b);
        // NOTE:
        // Maximum value that we can store in byte is 256, so the remainder of the max value and given value is stored in the variable
        // i.e 257 % 256 = 1

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int d = x * y / z;
        System.err.println(d);
        // 20, since 40 * 50 = 2000 / 100 = 20
        // But how is byte able to store 2000!?
        // Since the expression is performed using integer and not bytes

        System.out.println(x*y/z); // Automatic assignment to int to perform operations

        int number = 'A';
        System.err.println(number);
        // 65 
        // Java follows UNICODE, meaning it can write all languages
        System.out.println("नमस्ते");
        // नमस्ते

        byte aa = 42;
        byte bb = 'a';
        short ss = 1024;
        int ii = 50000;
        float ff = 5.67f;
        double dd = 0.1234;
        double result = (ff * aa) + (ii/bb) - (dd * ss);
        System.err.println((ff * aa) + " " + (ii/bb) + " " + (dd * ss));
                // float + int - double
                // = double
        System.err.println("Result: "+ result);
    }
}
