package restaurant;

import java.util.ArrayList;

public class OfflineOrder extends Orders {

  private int table;

  public OfflineOrder(ArrayList<String> dishes, int table) {
    super(dishes);
    this.table = table;
  }
}
