public class IWontCheatOnTheExams {

    public static void main(String[] args) {
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"

        String exam = "I won't cheat on the exam";

        // Print the first 10 numbers
      /*  for (int i = 0; i < 100; i++) {
            System.out.println( i +1 + " " + exam);
        }  */


        int i = 0;
        while (i < 100) {
            System.out.println(i + 1 + " " + exam);
            i ++;
        }

        int k =101;     //101 starting of the counter ----->it will print anyway the statement make to do it because the conditional is later declared.
        do {                // do the statement under this
            System.out.println(k + 1 + " " + exam);
            k++;            // increase the counter
        } while (k<100);       //till it reaches 100 times


      /* for (int i = 0; i < 100; i++) {
            System.out.println(i); // Prints the numbers from 0 to 99 */
    }


}


