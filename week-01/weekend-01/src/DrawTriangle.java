import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
      //  csicsisTriangle();
        System.out.println("Let's make a triangle");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String star = "*";
                System.out.print(star);
            }
            System.out.println();
        }

    }
    private static void csicsisTriangle(){
        System.out.println("Let's make a triangle");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stars = "*";
        for (int i = 0; i < n; i++) {
            System.out.print(stars);
            System.out.println();
            stars = stars + "*";
        }
    }
}
