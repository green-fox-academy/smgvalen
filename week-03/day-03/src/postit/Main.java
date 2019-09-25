package postit;

import java.awt.Color;

public class Main {

  /* Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!" */
  public static void main(String[] args) {

    PostIt firstPostIt = new PostIt();
    firstPostIt.backgroundColor = Color.orange;
    firstPostIt.text = "Idea 1";
    firstPostIt.textColor = Color.blue;

    PostIt secondPostIt = new PostIt();
    secondPostIt.backgroundColor = Color.pink;
    secondPostIt.text = "Awesome";
    secondPostIt.textColor = Color.black;

    PostIt thirdPostIt = new PostIt(Color.yellow, "Superb!", Color.green);
    System.out.println(thirdPostIt.backgroundColor);
  }

}
