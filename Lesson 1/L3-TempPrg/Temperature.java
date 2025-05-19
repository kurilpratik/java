
import java.util.Scanner;


public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Please enter temp in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) +32;
        System.err.println("Temp in F: "+ tempF);
    }
}
