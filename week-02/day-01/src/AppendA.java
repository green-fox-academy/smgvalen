public class AppendA {
    public static void main(String[] args) {
        // - Create an array variable named `animals`
        //   with the following content: `["koal", "pand", "zebr"]`
        // - Add all elements an `"a"` at the end

        String[] animals = {"koal", "pand", "zebr"};

        // System.out.println(animals[1] = animals[1]+"a");
        // in line 9
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animals[i] + "a";
            System.out.print(animals[i] + ", ");

        }

    }

}



