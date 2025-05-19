import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // out by default refers to the cmd, it could also be a file or something else
        System.out.println("Hello, how are you?");
        Scanner input = new Scanner(System.in);
        // next() -> Reads only till first space
        System.out.println(input.nextLine());
    }
}
