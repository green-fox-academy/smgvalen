public class Doubling {
    public static void main(String[] args) {
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
        int baseNum = 123;  // created an integer named baseNum with the value 123.
      /*  int justATestNumber = 200;
        doubling(justATestNumber);
        System.out.println(doubling(justATestNumber));
        System.out.println(doubling(14)); */
      int doubledBaseNum = doubling(baseNum);
        System.out.println(doubledBaseNum);

    }
    public static int doubling (int doubledNumber){
        return doubledNumber *2;
    }
}
