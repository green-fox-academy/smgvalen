class ForEach {

    public static void main(String[] arg) {
        {
            int[] marks = {125, 132, 95, 116, 110}; // letrehoztuk a marks tombot az adott elemekkel

            int highest_marks = maximum(marks); // highest_marks letrehozva, erteket majd a maximum() fuggveny adja meg
            System.out.println("The highest score is " + highest_marks);
        }
    }

    public static int maximum(int[] numbers) {  // letrehozzuk a maximum() fuggvenyt, aminek a sajat argumentuma a numbers tomb
        int maxSoFar = numbers[0]; // letrehozzuk a maxSoFar valtozot, melynek erteke a tomb elso elemenek erteke (szinten sajat belso valtozo)

        // for each loop
        for (int num : numbers) { // num sajat belso valtozo mely folyamatosan felveszi a tomb ertekeit, mikozben a loop vegigfut a numbersen
            if (num > maxSoFar) { // ha az aktualis num nagyobb a maxSoFar valtozo ertekenel, rendelje hozza a maxSoFar-hoz a num erteket
                maxSoFar = num;
            }
        }
        return maxSoFar; // a fuggveny a maxSoFar erteket adja vissza, mely visszakerul a mainbe es a highest_marks erteke lesz
    }
}
