public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention
        String textPart1 = "My todo:\n";
        String textPart2 = " - Download games\n";
        String textPart3 = "\t - Diablo";

        StringBuilder sb1 = new StringBuilder(todoText);

        sb1.insert(0, textPart1); // add this to the beginning of the todoText

        sb1.append(textPart2);  //add textPart2 to the stringbuilder

        sb1.append(textPart3);  // add part3 to the stringbuilder

        todoText = sb1.toString();  //adding stringbuilder to todoText

        System.out.println(todoText);
    }
}
