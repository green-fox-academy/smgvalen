
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.lang.StackTraceElement;


public class CopyFile {

  public static void main(String[] args) throws IOException {

    String fileNameFrom = "src/myFile.txt";
    String fileNameTo = "src/copiedMyFile.txt";
    System.out.println(copy(fileNameFrom, fileNameTo));

  }
  // created a  boolean function which takes the filenames as parameters
  public static boolean copy (String fileFrom, String fileTo) throws IOException {
    boolean copyingResult = false;
    Path pathFrom = Paths.get(fileFrom);
    Path pathTo = Paths.get(fileTo);

    try {
      List<String> linesFrom = Files.readAllLines(pathFrom);
      List<String> lines2 = Files.readAllLines(pathTo);

      for (String line : linesFrom) {
        lines2.add(line);
      }
      Files.write(pathTo, lines2);
      copyingResult = true;
    } catch (IOException e) {
      System.out.println("false, could not read the file");  // nem értem miért nem működik!!
    }
    return copyingResult;
  }
}
//// Write a function that copies the contents of a file into another
//// It should take the filenames as parameters
//// It should return a boolean that shows if the copy was successful
