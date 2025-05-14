public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Car("Honda", 7, 14, 7);
        vehicles[1] = new ElectricScooter("Byd", 2);
        vehicles[2] = new Bike("Reign", 4);
        vehicles[3] = new Car("Kia", 8, 11, 6);
        vehicles[4] = new ElectricScooter("Tesla", 1);
        vehicles[5] = new Bike("Trance", 2);

        double totalEfficiencyScore = 0;
        double lowestCost = Double.MAX_VALUE;
        Vehicle cheapestVehicle = null;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.fuelType();
            vehicle.move();
            System.out.println("Efficiency: " + vehicle.efficiencyScore());
            System.out.println("Cost per 100 km: " + vehicle.costPer100Km() + "₪");
            totalEfficiencyScore += vehicle.efficiencyScore();

            if (lowestCost > vehicle.costPer100Km()) {
                lowestCost = vehicle.costPer100Km();
                cheapestVehicle = vehicle;
            }
        }
        //calculate the average
        double averageEfficiencyScore = totalEfficiencyScore / vehicles.length;
        System.out.println("\nAverage Efficiency Score: " + averageEfficiencyScore);

        if (cheapestVehicle != null) {
            System.out.println("\nCheapest vehicle per 100 km:");
            cheapestVehicle.displayInfo();
            System.out.println("Cost per 100 km: " + cheapestVehicle.costPer100Km() + "₪");
        } else {
            System.out.println("\nNo vehicles found.");
        }
    }
}