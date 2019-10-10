package dictionary;

import java.util.List;

public class Dictionary {

  public int[] makeArray(List<Integer> arr, int n) {
    int max = 0;
    int length = arr.size();

    for (int i = 0; i < length; i++) {
      if (arr.get(i) > max) {
        max = arr.get(i);
      }

    }


    return
  }

}
