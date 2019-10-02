package anagrams;

import java.util.Arrays;

public class Anagrams {

    public boolean checkAnagram ( String word1, String word2) {
      if (word1.length() == word2.length()) {
          char[] char1 = word1.toCharArray();
          char[] char2 = word2.toCharArray();

          Arrays.sort(char1);
          Arrays.sort(char2);
          if(Arrays.equals(char1, char2)) {
            return true;
          } else return false;
      } return false;
  }
}
// Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
//Create a test for that.