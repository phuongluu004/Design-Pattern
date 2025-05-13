public class BicycleFactory extends VehicleFactory {
    @Override
    public Bicycle createVehicle(String type) {
        if ("Bicycle".equalsIgnoreCase(type)) {
            return new Bicycle();
        }
        return null; // Hoặc throw một exception nếu type không hợp lệ
    }
}