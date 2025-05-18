public class ToyotaBicycle extends Bicycle {
    public ToyotaBicycle() {
        super("Toyota");
    }

    @Override
    public int getMaxSpeed() {
        return 30; // Theo yêu cầu của đề bài
    }
}