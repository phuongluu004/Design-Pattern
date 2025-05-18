public abstract class Bicycle {
    protected String brand;

    public Bicycle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract int getMaxSpeed();
}