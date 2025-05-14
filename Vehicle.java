public abstract class Vehicle implements IMovable {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("Model: " + model + "Year: " + year);
    }
    public abstract void fuelType();

    public abstract double costPer100Km();
}
