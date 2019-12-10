import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    Path filePath = Paths.get("C:\\Users\\Valen\\greenfox\\smgvalen\\week-03\\day-02\\src\\duplicated-chars.txt");
    decryptDoubledChars(filePath);
  }

  public static void decryptDoubledChars(Path filepath) {
    try {
      List<String> lines = Files.readAllLines(filepath);
      List<String> singled = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        String justWord = "";
        if (lines.get(i).length() > 0) {
          justWord = justWord + lines.get(i).charAt(0);
        }
        for (int j = 0; j < lines.get(i).length() - 1; j++) {
          if (lines.get(i).charAt(j + 1) != lines.get(i).charAt(j)) {

              justWord = justWord + lines.get(i).charAt(j + 1);
          }
        }
        singled.add(justWord);
      }
      Files.write(filepath, singled);
    } catch (Exception e) {
      System.out.println("couldn't read it");
    }
  }
}
