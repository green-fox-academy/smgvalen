import java.util.HashMap;

public class MapIntro1 {
    public static void main(String[] args) {

        HashMap < Integer, Character> map1 = new HashMap<>();

        System.out.println(map1.isEmpty());

        map1.put(97, 'a');
        map1.put(98, 'b');
        map1.put(99, 'c');
        map1.put(65, 'A');
        map1.put(66, 'B');
        map1.put(67, 'C');

        for (Integer key : map1.keySet()) {   // all the keys printed out
            System.out.println(key);
        }
        for (Character value: map1.values()) {  //all the values printed out
            System.out.println(value);
        }
        map1.put(68, 'D'); //added new value with key to the map1

        System.out.println(map1.size()); // print number of key-value pairs in the map1

        System.out.println(map1.get(99)); //print value of paired with key 99

        map1.remove(97);        //remove key-value with key 97

        System.out.println(map1.containsKey(100)); // map1 contains value with key 100?

        map1.clear();  //delete all the keys:values




    }
}
