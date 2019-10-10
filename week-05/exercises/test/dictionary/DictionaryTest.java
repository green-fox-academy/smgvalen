package dictionary;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class DictionaryTest {

  Dictionary dictionary = new Dictionary();

  @Test
  public void testingMakeArray1() {
    // mit tesztelek
    List<Integer> testList = new ArrayList<>();
    testList.add(0);
    testList.add(1);
    testList.add(5);
    testList.add(4);
    int n = 3;
    // milyen funkcióval tesztelem
    int[] result = dictionary.makeArray(testList, n);
    //milyen eredményt várok
    int[] expectedResult = {0, 1, 25, 4};
    //egyezik e a várt eredmény, a funkcióban kiadott eredménnyel
    assertArrayEquals(expectedResult, result);
  }

  @Test
  public void testingMakeArray2() {
    List<Integer> testList = new ArrayList<>();
    testList.add(0);
    testList.add(3);
    testList.add(5);
    testList.add(4);
    testList.add(3);
    testList.add(6);
    int n = 2;

    int[] testResult = dictionary.makeArray(testList, n);

    int[] expectedResult = {0, 18, 5, 24, 3, 36};

    assertArrayEquals(expectedResult, testResult);
  }
}