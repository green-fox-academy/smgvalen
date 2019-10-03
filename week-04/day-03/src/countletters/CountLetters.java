package countletters;

import java.util.HashMap;

public class CountLetters {

  public HashMap createDictionary(String word) {
    char[] charArray = word.toCharArray();
    HashMap<Character, Integer> charCounter = new HashMap<>();
    for ( char i : charArray ) {
     // charCounter.containsKey(charsOfWord[i]);
      if ( charCounter.get(i) != charCounter.get(i+1) ) {
        charArray.equals(createDictionary(word));
      }
    }
    return charCounter;
  }

}
//Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
//Create a test for that.
