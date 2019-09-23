import java.util.Scanner;

public class DrawDiamond {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lines of diamond: ");
    int n = scanner.nextInt();

    for (int i = 0; i <= n / 2; i++) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print(" *");
      }
      System.out.println();
    }

    for (int i = n / 2 + 1; i >= 0; i--) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}

