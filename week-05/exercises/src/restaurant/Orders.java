package restaurant;

import java.util.ArrayList;
import java.util.Random;

public class Orders {

  private int id = new Random().nextInt(9000) + 1000;
  private String status;
  private ArrayList<String> dishes = new ArrayList<>();

  public Orders(ArrayList<String> dishes) {
    this.dishes = dishes;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void delay(){
    setStatus("waiting");
  }

  public void deliver(){
    setStatus("delivered");
  }

  public void reject(){
    setStatus("rejected");
  }

  public ArrayList<String> getDishes(){
    return dishes;
  }
}
//Create an `Order` class with 3 private fields
//
//- `id` - a randomly generated number (1000 < x <= 9999) for each order it cannot be set as constructor argument
//- `status` - a string, its default value is created, cannot be set as constructor argument
//- `dishes` - a `Dish` array which is set through the constructor as argument
//
//and 4 methods
//
//- `delay()` - it sets the `status` field to `waiting`
//- `deliver()` - it sets the `status` field to `delivered`
//- `reject()` - it sets the `status` field to `rejected`
//- `getDishes()` - it returns the `Dish`es associated with the `Order`
