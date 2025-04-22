// If we have a file Main.java, it must contain a class Main.
// Any vairable starting with a capital letter in any language is a class (convention)
// Convention - Name of the class must start with a capital letter
// The class with the same name as the file should be public (convention)


// Use javac Main.java to convert your java code to byte code
// To get output run java Main
public class Main {

    // Why is the main fnc static? Because we can't create an object to call it as the first thing that happens in a program is it runs main nat anything else so main needs to be static.
    public static void main(String[] args) {
        System.out.println(args[0]);   
        // String[] args is the command line argument, whatever argument we are passing in the terminal while running java Main is stored in the args array
    }
}

// java Main "Hello" 
// O/P: Hello