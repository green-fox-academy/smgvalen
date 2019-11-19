import static org.junit.Assert.*;
import org.junit.Test;

public class AnagramTest {

  Anagram anagram = new Anagram();

  @Test
  public void isAnagram_SameString_ReturnsTrue() {
    String first = "mum";
    String second = "mum";
    assertEquals(true, anagram.isAnagram(first, second));
  }

  @Test
  public void isAnagram_SameStringIgnoreCase_ReturnsTrue() {
    String first = "mum";
    String second = "Mum";
    assertEquals(true, anagram.isAnagram(first, second));
  }

  @Test
  public void isAnagram_TwoAnagramsIgnoreCase_ReturnsTrue() {
    String first = "mum";
    String second = "umm";
    assertEquals(true, anagram.isAnagram(first, second));
  }
  @Test
  public void isAnagram_DifferentLengthIgnoreCase_ReturnsFalse() {
    String first = "mum";
    String second = "mummum";
    assertEquals(false, anagram.isAnagram(first, second));
  }

  @Test
  public void isAnagram_SameLengthWithSpaceIgnoreCase_ReturnsTrue() {
    String first = "mum mum";
    String second = "mummum";
    assertEquals(true, anagram.isAnagram(first, second));
  }
}