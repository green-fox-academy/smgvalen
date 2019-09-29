import java.util.ArrayList;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> listOfExpenses = new ArrayList<>();
        listOfExpenses.add(500);
        listOfExpenses.add(1250);
        listOfExpenses.add(175);
        listOfExpenses.add(800);
        listOfExpenses.add(120);
        System.out.println(sum(listOfExpenses));
        System.out.println(max(listOfExpenses));
        System.out.println(min(listOfExpenses));
        System.out.println(average(listOfExpenses));
    }

    //how much did we spend?
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static int max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }
    public static int average (ArrayList<Integer> list) {
          return sum(list) / list.size();
    }
}
// We are going to represent our expenses in a list containing integers.
//
//Create a list with the following items.
//500, 1000, 1250, 175, 800 and 120
//Create an application which solves the following problems.
//How much did we spend?
//Which was our greatest expense?
//Which was our cheapest spending?
//What was the average amount of our spendings?