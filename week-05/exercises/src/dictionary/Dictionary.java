package dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

  public static int[] makeArray(List<Integer> arr, int n) {
    int max = 0;
    int length = arr.size();

    for (int i = 0; i < length; i++) {
      if (arr.get(i) > max) {
        max = arr.get(i);
      }
    }
    int[] testArray = new int[length];
    for (int i = 0; i < testArray.length; i++) {
      testArray[i] = arr.get(i);
      if ((i + 1) % n == 0) {
        testArray[i] = testArray[i] * max;
      }
    }
    return testArray;
  }
}

