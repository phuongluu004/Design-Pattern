package strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        // Chiến lược tốc độ cho ô tô
        vehicle.setSpeedStrategy(new CarSpeedStrategy());
        System.out.println("Tốc độ xe hơi: " + vehicle.getMaxSpeed());

        // Chiến lược tốc độ cho xe đạp
        vehicle.setSpeedStrategy(new BicycleSpeedStrategy());
        System.out.println("Tốc độ xe đạp: " + vehicle.getMaxSpeed());
    }
}
