import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a distance in miles!");

        double MileToKmConverter = scanner.nextDouble();
        double distanceInKm = MileToKmConverter * 1.6;
        System.out.println(MileToKmConverter +" miles is " + distanceInKm +"km");
    }
}
