package feedback;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Feedback {

  public static void main(String[] args) {

    String m = "matReview";
    String p = "presSkills";
    String h = "helpfulness";
    String e = "explanation";
    String file = "responses.txt";
    HashMap<String, Double> result = new HashMap<>();
    try {
      result = calculateRatings(file);
    } catch (Exception exception) {
      System.out.println("File does not findable!");
    }
    System.out.println(result);
  }

  public static HashMap<String, Double> calculateRatings(String file) {
    HashMap<String, Double> ratingResults = new HashMap<>();
    int sumM = 0;
    int sumP = 0;
    int sumH = 0;
    int sumE = 0;
    try {
      Path path = Paths.get(String.valueOf(file));
      List<String> lines = Files.readAllLines(path);

      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j++) {
          if (lines.get(i).charAt(j) == 0) {
            
          }
        }

      }


    } catch (IOException e) {
      System.out.println("File was not found");
    }

    return ratingResults;
  }

}
