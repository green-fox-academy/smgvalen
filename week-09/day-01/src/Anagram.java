import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {

    isAnagram("mummum", "mum mum");

  }

  public static boolean isAnagram(String input1, String input2) {

    char[] charArray1 = input1.toLowerCase().replaceAll("\\s", "").toCharArray();
    char[] charArray2 = input2.toLowerCase().replaceAll("\\s", "").toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

     return (Arrays.equals(charArray1, charArray2));
    }
  }


