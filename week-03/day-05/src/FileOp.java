
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileOp {
    public static void main(String[] args)  {
        List<String> lines = new ArrayList<>();
        // beolvasom a fileba
        Path filePath = Paths.get("src/Names.txt");
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("I couldn't track the file");
        }
        // szavakra bontás
        String longestWord = "";

        for (int i = 0; i < lines.size(); i++) {
           String[] words = lines.get(i).split(" ");  // string arrayjel szétválasztottuk a szavakat minden sorban
            String firstWord = words[0]; //mivel az első elem kell, azt kiszedjük
            // megkeresem a leghosszabbat
            // elmentem
            if (firstWord.length() > longestWord.length()) {
                longestWord = firstWord;
            }
        }
        //törlöm a többit
        // fileba mentem a leghosszabbat
        System.out.println(longestWord);

        List<String> result = new ArrayList<>();
        result.add(longestWord);
        try {
            Files.write(filePath, result);
        } catch (IOException e) {
            System.out.println("I couldn't track the file");
        }


    }
}
