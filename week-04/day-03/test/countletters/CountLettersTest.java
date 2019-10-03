package countletters;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class CountLettersTest {

  @Test
  public void createDictionary_SetCharsIntoHM() {
    CountLetters testCountLetters = new CountLetters();
    HashMap<Character, Integer> resultHashMap = new HashMap<>();

    resultHashMap.put('m', 3);
    resultHashMap.put('a', 1);
    resultHashMap.put('u', 1);
    resultHashMap.put('t', 1);

    assertEquals("mammut", testCountLetters.createDictionary("mammut"));
  }
}