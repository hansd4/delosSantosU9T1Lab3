public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setTollFee(double newTollFee) {
        tollFee = newTollFee;
    }

    public void setPassengers(int newPassengers) {
        passengers = newPassengers;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public void printInfo() {
        System.out.println("License plate: " + licensePlate +
                "\nToll fee: " + tollFee +
                "\nPassengers: " + passengers);
    }

    public void bill() {
        System.out.println("Billed the owner of the vehicle in the amount of " + calculateTollPrice());
    }
}
