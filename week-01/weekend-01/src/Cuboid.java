public class Cuboid {
    public static void main(String[] args) {
        double length = 1;
        double width = 2;
        double height = 3;

        double volume = length * width * height;
        System.out.println("Volume :" + volume);

        double surfaceArea = 2 * ( length * width + length * height + width * length);
        System.out.println("Surface Area: " + surfaceArea);
    }
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000


}
