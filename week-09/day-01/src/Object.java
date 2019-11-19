import java.util.ArrayList;
import java.util.List;

public class Object {

  private int age;
  private String name;
  private boolean male;

  public Object(int age, String name, boolean male){
    this.age=age;
    this.name=name;
    this.male=male;
  }

  public Object(){}

  List<Object> persons = new ArrayList<>();

  Object person = new Object(20, "Laca", true);
  Object person2 = new Object(30, "Saca", false);

}
