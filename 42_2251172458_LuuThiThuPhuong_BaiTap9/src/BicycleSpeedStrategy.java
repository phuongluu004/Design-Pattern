package strategy;

public class BicycleSpeedStrategy implements SpeedStrategy {
    @Override
    public int getMaxSpeed() {
        return 30;
    }
}
