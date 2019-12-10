package restaurant;

import java.util.HashMap;

public class Restaurant {
  private HashMap<String, Integer> inventory;


  public Restaurant(HashMap<String, Integer> inventory){
    this.inventory = new HashMap<>();
    inventory.put("ingredient1", 0);
    inventory.put("ingredient2", 0);
  }

  public String recieveOrder(Orders order) {

  }

}
//Create a `Restaurant` class. This class will process the orders. It has 1 private field which must be set through the constructor.
//
//- `inventory` - it will hold the available ingredients (it will have only two keys, `ingredient1` and `ingredient2`)
//
//and 1 public method
//
//- `receiveOrder(order)` - it takes an `Order` as argument.
//  - if the dishes in the order can be made (there is enough ingredients in the inventory) then it must reduce the resources in the inventory and call the deliver method on the order
//  - if there is not enough ingredients and the parameter is an online order then it must call the delay method of the order
//  - otherwise it must reject the order
//  - finally it must return the order