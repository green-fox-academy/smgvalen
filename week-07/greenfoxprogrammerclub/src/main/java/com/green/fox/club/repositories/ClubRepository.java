package com.green.fox.club.repositories;

import com.green.fox.club.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ClubRepository {

  private List<Fox> foxes = new ArrayList<>();

  public ClubRepository(){
    foxes.add(new Fox("Vuk", 2, "frog", "coke"));
    foxes.add(new Fox("Mr. Fox", 0, "salad", "lemonade"));
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void add(Fox fox) {
    foxes.add(fox);
  }
}
