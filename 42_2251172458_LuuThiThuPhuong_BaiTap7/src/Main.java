public class Main {
    public static void main(String[] args) {
        Speed carSpeed = new SportsCar();
        Speed bicycleSpeed = new SportsBicycle();

        Vehicle car = new Vehicle(carSpeed);
        Vehicle bicycle = new Vehicle(bicycleSpeed);

        System.out.println("=== Car Info ===");
        System.out.println("Max Speed: " + car.getMaxSpeed());
        System.out.println("Power: " + car.getPower());
        System.out.println("Engine Type: " + car.getEngineType());
        System.out.println("Efficiency: " + car.getEfficiency());

        System.out.println("\n=== Bicycle Info ===");
        System.out.println("Max Speed: " + bicycle.getMaxSpeed());
        System.out.println("Power: " + bicycle.getPower());
        System.out.println("Engine Type: " + bicycle.getEngineType());
        System.out.println("Efficiency: " + bicycle.getEfficiency());
    }
}
