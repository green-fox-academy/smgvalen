import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:

        System.out.println("Give me a number:");  //print this line to the terminal
        Scanner scanner = new Scanner(System.in);  // create scanner to input something in the terminal
        int i = scanner.nextInt();  // program can scan an integer
        for ( int j = 0; j < 10 ; j++) {        //
            System.out.println(j + 1 + " * " + i + " = " + i*j);
        }

    }
}
