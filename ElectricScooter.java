public class ElectricScooter extends Vehicle implements IMovable{
    public ElectricScooter(String model, int year) {
        super(model, year);
    }
    @Override
    public void fuelType() {
        System.out.println("Electric");
    }

    @Override
    public void move() {
       System.out. println("Scooter is gliding");
    }

    @Override
    public int efficiencyScore() {
        return 95;
    }

    @Override
    public double costPer100Km() {
        return 5;
    }

}
