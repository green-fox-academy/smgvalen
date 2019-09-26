package petrolstation;

public class Station {
    int gasAmount = 500;

    public Station() {
    }

    public void refill(Car car) {
        this.gasAmount -=  car.capacity;
        car.gasAmount +=  this.gasAmount;
    }
}
// Station
//gasAmount
//refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
