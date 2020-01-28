public class SumAll {

  public static void main(String[] args) {

    int[] ai = {3, 4, 5, 6, 7};
    System.out.println(sumAllElements(ai));

  }

  public static String sumAllElements(int[] ai) {
            // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    int sumOfAi = 0;                    // create the sum int, when i in for loop has a value, it adds to sumOfAi, and
    for (int i : ai) {                // goes back to the loop for the second value of the array, adds that value
      sumOfAi = sumOfAi + i;        // to the sumOfAi again. so it increases in all round of the loop with the next
    }                                 // element of the array!
    // after adding the last element, goes down
    // - Print the sum of the elements in `ai`
    return "the result is: " +sumOfAi;
  }
}


