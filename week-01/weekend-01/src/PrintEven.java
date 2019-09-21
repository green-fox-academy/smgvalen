public class PrintEven {
    public static void main(String[] args) {

        // Create a program that prints all the even numbers between 0 and 500
        // 1. create and initialize the first variable of the statement
        // 2. till when repeats
        // 3. every round modify the value of the variable
        for (int i = 0; i < 500; i ++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
