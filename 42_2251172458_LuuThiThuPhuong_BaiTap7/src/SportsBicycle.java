public class SportsBicycle implements Speed {

    @Override
    public int getMaxSpeed() {
        return 30;
    }

    @Override
    public int getPower() {
        return 0; // Không có động cơ
    }

    @Override
    public String getEngineType() {
        return "diesel";
    }

    @Override
    public double getEfficiency() {
        return 0.0;
    }
}
