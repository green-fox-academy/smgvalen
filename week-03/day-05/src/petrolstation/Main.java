package petrolstation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Station station = new Station(500);
        station.refill(car);

        System.out.println(car.gasAmount);
        System.out.println(station.gasAmount);
    }
}
