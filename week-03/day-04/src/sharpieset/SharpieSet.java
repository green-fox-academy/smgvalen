package sharpieset;


import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  List<Sharpie> sharpieList = new ArrayList<>();

  public SharpieSet() {
  }

  public int countUsable() {
    int counter = 0;
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount <= 0) {
          sharpieList.remove(i);
      }
    }
  }
}

// Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//countUsable() -> sharpie is usable if it has ink in it
//removeTrash() -> removes all unusable sharpies
