package anagrams;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramsTest {
  Anagrams anagrams = new Anagrams();


  @Test
  public void checkAnagram_true() {
    boolean result = anagrams.checkAnagram("word", "dorw");

    assertEquals(true, result);
  }

  @Test
  public void checkAnagram_diffSizeWords() {
    boolean result = anagrams.checkAnagram("word", "wordword");

    assertEquals(false, result);
  }

  @Test
  public void checkAnagram_diffChars() {
    boolean result = anagrams.checkAnagram("word", "ward");

    assertEquals(false, result);
  }
}