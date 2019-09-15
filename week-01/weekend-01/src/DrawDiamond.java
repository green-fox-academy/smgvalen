import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lines of diamond: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print("0");

                for (int k = 0; k < j; k++) {
                    System.out.print(" *");
                }
                System.out.println();
            }

        //    for (int l = n - 1; l >; l--)

        }


    }
}
