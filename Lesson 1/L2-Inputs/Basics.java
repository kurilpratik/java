
public class Basics {
    public static void main(String[] args) {
        if (true) {
            System.err.println("Hello World");
        }

        int a = 10;
        if (a == 10) {
            System.err.println("Hello World");
        }

        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        for (int i=0; i!=5; i++) {
            System.out.println(i);
        }
    }
}
