public class TeslaCar extends Car {
    public TeslaCar() {
        super("Tesla");
    }

    @Override
    public int getMaxSpeed() {
        // Giá trị mặc định, bạn có thể thay đổi
        return 250;
    }
}