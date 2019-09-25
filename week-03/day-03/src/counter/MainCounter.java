package counter;

public class MainCounter {

  public static void main(String[] args) {

    Counter counter = new Counter();
    counter.add();
    counter.add(20);
    counter.get();
    counter.reset();
    System.out.println(counter);
  }

}
