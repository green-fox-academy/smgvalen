public class Reverse {
    public static void main(String[] args) {
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        int revLength = reversed.length();
        String temp = "";

        for (int i = revLength - 1; i > -1; i--) {
            reversed.charAt(i);
            temp = temp + reversed.charAt(i);
        }
        System.out.println(temp);
    }
}
