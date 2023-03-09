import java.util.ArrayList;

public class VehicleRunner {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle v = new Vehicle("N19JK1", 15.60, 4);
        vehicles.add(v);
        Car c = new Car("19842H", 18.39, 2, true);
        vehicles.add(c);
        Truck truck = new Truck("1398MX", 78.30, 1, 8, true);
        vehicles.add(truck);
        Taxi t = new Taxi("T9832C", 8.50, 4, false, 90);
        vehicles.add(t);
        for (Vehicle vehicle : vehicles) {
            vehicle.bill();
        }
    }
}
