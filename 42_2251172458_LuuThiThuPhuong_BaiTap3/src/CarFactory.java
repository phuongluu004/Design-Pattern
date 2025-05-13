public class CarFactory extends VehicleFactory {
    @Override
    public Car createVehicle(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        }
        return null; // Hoặc throw một exception nếu type không hợp lệ
    }
}