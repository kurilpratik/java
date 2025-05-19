import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Please enter roll no");
        int rollno = input.nextInt();
        System.err.println("Your roll no is "+ rollno);

        int a = 12_50_000;
        System.err.println(a);
        // Underscores are ignored

        float marks = input.nextFloat();
        System.err.println(marks);
    }
}
