public class Car extends Vehicle implements IMovable{
    private double fuelConsumptionPer100Km;
    private double fuelPricePerLiter;

    public Car(String model, int year, double fuelConsumptionPer100Km, double fuelPricePerLiter) {
        super(model, year);
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        this.fuelPricePerLiter = fuelPricePerLiter;
    }

    public double getFuelConsumptionPer100Km() {
        return fuelConsumptionPer100Km;
    }

    public void setFuelConsumptionPer100Km(double fuelConsumptionPer100Km) {
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    }

    public double getFuelPricePerLiter() {
        return fuelPricePerLiter;
    }

    public void setFuelPricePerLiter(double fuelPricePerLiter) {
        this.fuelPricePerLiter = fuelPricePerLiter;
    }

    @Override
    public void fuelType() {
        System.out.println("Gasoline");
    }

    @Override
    public double costPer100Km() {
        return fuelConsumptionPer100Km * fuelPricePerLiter;
    }

    @Override
    public int efficiencyScore() {
        return 100 / (int)fuelConsumptionPer100Km;
    }

    @Override
    public void move() {
        System.out.println("The car is moving");
    }
}
