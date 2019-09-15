
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

      /*  for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print((j + 1) + ", ");
            }
            System.out.println();
        } */
        System.out.println("Rows of pyramid:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for ( int i = 0; i <= n; i++)
        {
            for ( int j = n; j > i; j--)
            {
                System.out.print(" ");
            }
            for ( int k = 0; k < i; k++)
            {
                System.out.print(" *");
            }
            System.out.println();

        }

    }
}