public class SwapElements {

  public static void main(String[] args) {
    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`

    String[] abc = {"first", "second", "third"};

    String temp = abc[0];       // created a temp(orary) variable with first element of abc
    abc[0] = abc[2];            // array abc [2] element assigned to the array abc [0]
    abc[2] = temp;              // value of temp assigned to array abc [2]

    for (int i = 0; i < abc.length; i++) {
      System.out.println(abc[i] + " ");

    }

  }
}
