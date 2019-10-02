package sum;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class SumTest {

  Sum sum = new Sum();

  @Test
  public void sum_MultipleElements() {
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,2,3));

    int result = sum.sum(test);

    assertEquals(6, result);
  }

  @Test
  public void sum_EmptyList() {
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList());

    int result = sum.sum(test);

    assertEquals(0, result);
  }

  @Test
  public void sum_OneElement() {
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1));

    int result = sum.sum(test);

    assertEquals(1, result);
  }

/*  @Test
  public void sum_null() {
    ArrayList<Integer> test = null;

    int result = sum.sum(test);

    assertEquals(null, result);
  } */
}