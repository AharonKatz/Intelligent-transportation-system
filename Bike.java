public class Bike extends Vehicle implements IMovable{
    public Bike(String model, int year) {
        super(model, year);
    }
    @Override
    public void fuelType() {
        System.out.println("Human-powered");
    }

    @Override
    public void move() {
        System.out.println("Bike is pedaling");
    }

    @Override
    public int efficiencyScore() {
        return 100;
    }

    @Override
    public double costPer100Km() {
        return 0;
    }
}
