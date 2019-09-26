package petrolstation;

public class Main {
    public static void main(String[] args) {
        Station station = new Station();
        Car car = new Car();

        station.refill(car);
        System.out.println(car.capacity);
        System.out.println(car.gasAmount);

    }
}
