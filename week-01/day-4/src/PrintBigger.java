import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Give me a number!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Give me another number!");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("The bigger number is: " + a);
        } else {
            System.out.println("The bigger number is: " + b);

        }
    }

}
