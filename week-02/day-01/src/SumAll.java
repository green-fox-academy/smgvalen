public class SumAll {
    public static void main(String[] args) {

        int[] ai = {3, 4, 5, 6, 7};      // - Create an array variable named `ai`
                                         //   with the following content: `[3, 4, 5, 6, 7]`
        int sumOfAi = 0;                 // create the sum int, when i in for loop has a value, it adds to sumOfAi, and
                                        // goes back to the loop for the second value of the array, adds that value
                                        // to the sumOfAi again. so it increases in all round of the loop with the next
                                        // element of the array!

        for ( int i : ai ) {
            sumOfAi = sumOfAi + i;
        }                                                                  // after adding the last element, goes down
        System.out.println("sum of the elements in 'ai':  " + sumOfAi);  // - Print the sum of the elements in `ai`
        }
    }
