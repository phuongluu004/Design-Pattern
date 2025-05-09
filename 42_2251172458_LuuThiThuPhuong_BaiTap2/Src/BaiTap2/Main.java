package BaiTap2;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bicycle() };

        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                System.out.println("Maximum speed of car: " + v.getMaxSpeed() + " km/h");
            } else if (v instanceof Bicycle) {
                System.out.println("Maximum speed of bicycle: " + v.getMaxSpeed() + " km/h");
            }
        }
    }
}
