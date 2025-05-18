public abstract class Car {
    protected String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract int getMaxSpeed();
}