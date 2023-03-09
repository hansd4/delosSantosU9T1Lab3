public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(boolean newDiscountApplied) {
        discountApplied = newDiscountApplied;
    }

    public void printCar() {
        System.out.println("License plate: " + getLicensePlate() +
                "\nToll fee: " + getTollFee() +
                "\nPassengers: " + getPassengers() +
                "\nElectric? " + electric +
                "\nDiscount applied? " + discountApplied);
    }

    public boolean dropOffPassengers(int numOut) {
        if (numOut < getPassengers()) {
            setPassengers(getPassengers() - numOut);
            return true;
        }
        return false;
    }

    public void applyDiscount() {
        if (!discountApplied && electric) {
            setTollFee(getTollFee() * .5);
            discountApplied = true;
        }
    }
}
