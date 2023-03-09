public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super (licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printTaxi() {
        System.out.println("License plate: " + getLicensePlate() +
                "\nToll fee: " + getTollFee() +
                "\nPassengers: " + getPassengers() +
                "\nElectric? " + isElectric() +
                "\nDiscount applied? " + isDiscountApplied() +
                "\nTotal fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if (!isDiscountApplied() && getPassengers() >= 4) {
            setTollFee(getTollFee() * .5);
            setDiscountApplied(true);
        }
    }
}
