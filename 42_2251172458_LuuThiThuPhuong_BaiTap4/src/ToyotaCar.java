public class ToyotaCar extends Car {
    public ToyotaCar() {
        super("Toyota");
    }

    @Override
    public int getMaxSpeed() {
        return 200; // Theo yêu cầu của đề bài
    }
}