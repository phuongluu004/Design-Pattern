public class SpeedMonitorMediator implements Mediator {
    private Car car;
    private Bicycle bicycle;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void notify(Vehicle sender) {
        if (sender == car) {
            reactOnCar();
        } else if (sender == bicycle) {
            reactOnBicycle();
        }
    }

    private void reactOnCar() {
        int speed = car.getMaxSpeed();
        System.out.println("Car speed: " + speed);
        if (speed > 100) {
            System.out.println("Warning: Car is too fast!");
        }
    }

    private void reactOnBicycle() {
        int speed = bicycle.getMaxSpeed();
        System.out.println("Bicycle speed: " + speed);
        if (speed > 50) {
            System.out.println("Warning: Bicycle is too fast!");
        }
    }
}
