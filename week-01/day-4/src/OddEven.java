import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number, please!");

        int Number = scanner.nextInt();
        if (Number % 2 == 0) {
            System.out.println("Even");
        }
                else {
                    System.out.println("Odd");

        }
    }
}
