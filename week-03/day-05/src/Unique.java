

public class Unique {
    public static int[] unique(int[] input) {

        int[] output = new int [] {input[0]};

        for (int inputCount = 0; inputCount < input.length; inputCount++) {
            boolean isMultiple = false;

            for (int outputCount = 0; outputCount < output.length; outputCount++) {
                if (input[inputCount] == output[outputCount]) {
                 isMultiple = true;
                 break;
                }
            }

            if ( isMultiple == false ) {
                int[] temp = new int[output.length+1];
                for (int outputCount = 0; outputCount < output.length; outputCount++) {
                    temp [outputCount] = output[outputCount];
                }
                temp[temp.length-1] = input[inputCount];
                output = temp;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
        int[] numbers = unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34});
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}