public class Factorio {

  public static void main(String[] args) {

    System.out.println(factorio(4));
  }

  public static int factorio(int fac) {
    int n = 1;
    for (int i = 1; i <= fac; i++) {
      n = n * i;
    }
    return n;
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
