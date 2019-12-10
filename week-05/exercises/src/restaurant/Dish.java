package restaurant;

import java.util.HashMap;

public class Dish {
  private String name;
  private HashMap<String, Integer> ingredients = new HashMap<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HashMap<String, Integer> getIngredients() {
    return ingredients;
  }

  public void setIngredients(HashMap<String, Integer> ingredients) {
    this.ingredients = ingredients;
  }



  public Dish (String name, HashMap<String, Integer> ingredients) {
    this.name = name;
    this.ingredients = ingredients;

  }
  public HashMap<String, Integer> returnIngredients(){
    return ingredients;
  }

}
//Create a `Dish` class, this will represent a dish what can be ordered from the restaurant. It has 2 private fields (these fields must be set through the constructor)
//
//- `name` - the name of the dish
//- `ingredients` - where we want to store the ingredients' name and amount
//  - For the sake of simplicity in our fictive world there are only two ingredients: `ingredient1` and `ingredient2`
//
//and one public method
//
//- `getIngredients()` - which returns the ingredients field