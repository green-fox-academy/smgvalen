import java.util.Arrays;
import java.util.Scanner;

public class SubInt {

  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    //   System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    // System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'
    System.out.println("give me the number of the list:");
    Scanner scanner = new Scanner(System.in);
    int elem = scanner.nextInt();
    int[] array = new int[elem];
    int n = 0;
    System.out.println("add  elements");
    for (int i = 0; i < array.length; i++) {

      Scanner scanner2 = new Scanner(System.in);  // adding elements of the array
      n = scanner2.nextInt();                    //
      array[i] = n;
    }

    System.out.println("search this number in the list");
    Scanner scanner3 = new Scanner(System.in);
    int number = scanner3.nextInt();

    // convert ints to Strings
    String stringNumber = String.valueOf(number);
    String[] stringArray = new String[elem];
    for (int i = 0; i < stringArray.length - 1; i++) {
      stringArray[i] = String.valueOf(array[i]);
    }
    for (int i = 0; i < stringArray.length - 1; i++) {
      //   int index = Arrays.asList(stringArray).indexOf(i);
      if (stringArray[i].contentEquals(stringNumber)) {
        System.out.println(stringNumber.indexOf(stringArray[i]));
      }

    }
  }
  // public static int subInt ( int[] inThisList, int input){

  //   }
}



