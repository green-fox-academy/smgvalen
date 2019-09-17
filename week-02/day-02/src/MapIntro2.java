import java.util.HashMap;

public class MapIntro2 {
    public static void main(String[] args) {

        HashMap < String, String > book = new HashMap<>();
                    // keys            values
        book.put("978-1-60309-452-8", "A Letter to Jo");
        book.put("978-1-60309-459-7", "Lupus");
        book.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        book.put("978-1-60309-461-0", "The Lab");

        /* Print all key-values in this format:
        A Letter to Jo (ISBN: 978-1-60309-452-8)
        Lupus (ISBN: 978-1-60309-459-7)
        Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        The Lab (ISBN: 978-1-60309-461-0)
         */
        for (String key : book.keySet()){
            System.out.println(book.get(key) + " ("  + key +")");
        }

        book.remove("978-1-60309-444-3");

         book.values().remove("The Lab"); // is it okay?

        book.put("978-1-60309-450-4", "They Called Us Enemy");
        book.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(book.containsKey("478-0-61159-424-8"));

        System.out.println(book.get("978-1-60309-453-5"));
    }
}
