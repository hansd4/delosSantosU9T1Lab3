public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public boolean validateLicensePlate() {
        if (hasTrailer) {
            String suffix = getLicensePlate().substring(getLicensePlate().length() - 2);
            if ((axles > 4 && suffix.equals("MX")) || suffix.equals("LX")) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public double calculateTollPrice() {
        if (hasTrailer) {
            return getTollFee() * axles * 2;
        } else {
            return getTollFee() * axles;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of axles: " + axles +
                "\nHas trailer? " + hasTrailer);
    }
}
