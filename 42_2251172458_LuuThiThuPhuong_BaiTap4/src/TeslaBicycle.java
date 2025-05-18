public class TeslaBicycle extends Bicycle {
    public TeslaBicycle() {
        super("Tesla");
    }

    @Override
    public int getMaxSpeed() {
        // Giá trị mặc định, bạn có thể thay đổi
        return 40;
    }
}