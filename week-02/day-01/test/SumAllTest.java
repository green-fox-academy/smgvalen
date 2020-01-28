import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SumAllTest {

  SumAll sumAll = new SumAll();


  @Test
  public void sumAll_AddNumbersCorrectly() {
    int[] testArray = {1,2,4,5};
  assertEquals("the result is: " + 12, sumAll.sumAllElements(testArray));
  }

  @Test
  public void sumAll_ShouldNotSumNumbersCorrectly() {
    int[] testArray = {1,1,1,1};
    assertNotEquals("the result is: " + 6, SumAll.sumAllElements(testArray));
  }
}