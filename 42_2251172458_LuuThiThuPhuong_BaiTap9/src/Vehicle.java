package strategy;

public class Vehicle {
    private SpeedStrategy speedStrategy;

    public void setSpeedStrategy(SpeedStrategy speedStrategy) {
        this.speedStrategy = speedStrategy;
    }

    public int getMaxSpeed() {
        if (speedStrategy == null) {
            throw new IllegalStateException("Speed strategy not set!");
        }
        return speedStrategy.getMaxSpeed();
    }
}
