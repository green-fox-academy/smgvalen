public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("The swapped value of variable a: " + a);
        System.out.println("The swapped value of variable b: " + b);

    }
}
