import static org.junit.Assert.*;

import org.junit.Test;

public class ApplesTest {

  @Test
  public void getApple() {
    Apples apples = new Apples();

    String result = apples.getApple();

    assertEquals("apple", result);
  }
}