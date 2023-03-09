public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super (licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if (!isDiscountApplied() && getPassengers() >= 4) {
            setTollFee(getTollFee() * .5);
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        int riders = getPassengers() - 1;
        fareCollected += farePerRider * riders;
        return dropOffPassengers(riders);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Total fare collected: " + fareCollected);
    }

    @Override
    public void bill() {
        System.out.println("Billed the riders of the taxi in the amount of " + calculateTollPrice());
    }
}
