package strategy;

public class CarSpeedStrategy implements SpeedStrategy {
    @Override
    public int getMaxSpeed() {
        return 200;
    }
}
