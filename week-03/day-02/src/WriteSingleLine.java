import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    manipulateFile("C:\\Users\\Valen\\greenfox\\smgvalen\\week-03\\day-02\\my-file.txt");

  }
  public static void manipulateFile (String line){
    List<String> name = new ArrayList<>();
    name.add("Sumegi Valentin");
    try {
      Path filepath = Paths.get(line);
      Files.write(filepath, name);
      // System.out.println(name.get(0));
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
