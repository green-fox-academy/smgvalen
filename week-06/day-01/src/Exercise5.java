import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Arrays;

public class Exercise5 {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

    System.out.println("sum of odd numbers in the list: " + stats.getSum());
  }
}
