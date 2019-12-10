package restaurant;

import java.util.ArrayList;

public class OnlineOrder extends Orders {

  private String address;

  public OnlineOrder(ArrayList<String> dishes, String address) {
    super(dishes);
    this.address = address;
  }
}
