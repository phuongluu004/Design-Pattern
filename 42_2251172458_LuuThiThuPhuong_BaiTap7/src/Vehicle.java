public class Vehicle {
    private Speed speed;

    public Vehicle(Speed speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return speed.getMaxSpeed();
    }

    public int getPower() {
        return speed.getPower();
    }

    public String getEngineType() {
        return speed.getEngineType();
    }

    public double getEfficiency() {
        return speed.getEfficiency();
    }
}
