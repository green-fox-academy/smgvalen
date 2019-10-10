package feedback;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
    List<String> mentorRatings = new ArrayList<>();
    int sumMat = 0;
    int sumPres = 0;
    int sumHelp = 0;
    int sumExplain = 0;
    int matRevRating = 0;
    int presSkillRating = 0;
    int helpRating = 0;
    int explanationRating = 0;

    try {
      Path path = Paths.get(file);
      mentorRatings.addAll(Files.readAllLines(path));
      } catch (IOException e) {
      System.out.println("File was not found");
    }
    mentorRatings.remove(0);

    for ( String line : mentorRatings) {
      String[] splitArray = line.split(" ");  // remove all spaces

      try {
        matRevRating = Integer.parseInt(splitArray[0]);
        presSkillRating = Integer.parseInt(splitArray[1]);
        helpRating = Integer.parseInt(splitArray[2]);
        explanationRating = Integer.parseInt(splitArray[3]);
      } catch (NumberFormatException ex) {
        System.out.println("Not convertable!");
      }
      sumMat += matRevRating;
      sumPres += presSkillRating;
      sumHelp +=helpRating;
      sumExplain += explanationRating;
    }

    double averageMatRev = (double) sumMat / mentorRatings.size();
    double averagePresSkill = (double) sumPres / mentorRatings.size();
    double averageHelp = (double) sumHelp / mentorRatings.size();
    double averageExp = (double) sumExplain / mentorRatings.size();

    ratingResults.put("matReview", averageMatRev);
    ratingResults.put("presSkills", averagePresSkill);
    ratingResults.put("helpfulness", averageHelp);
    ratingResults.put("explanations", averageExp);

    return ratingResults;
  }
}
