public class DoubleItems {

  public static void main(String[] args) {
    // - Create an array variable named `numList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
    int[] numList = {3, 4, 5, 6, 7};

    for (int i = 0; i < numList.length; i++) {
      numList[i] = numList[i] * 2;
      System.out.print(numList[i] + ", ");
    }
  }
}
/*    old version
        int[] numList = {3, 4, 5, 6, 7};
        for (int i = 0; i < numList.length; i++) {  // every round till i smaller than numList.length (5), i increased
            numList[i] = numList[i] * 2;            //and doubles the actual element of the array, afterwards goes back
                                                    // doubles all the elements of the array
        }                                           // when finishes, go to the other - for loop -
        for (int i = 0; i < numList.length; i++) {  // same conditional above
            System.out.print(numList[i] + " ");     // in every round prints one value of the array in order,
                                                    // adds a space, after goes out from the loop, ends method.
        } */

