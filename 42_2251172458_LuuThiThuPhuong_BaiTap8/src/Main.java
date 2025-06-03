public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        SpeedMonitorMediator mediator = new SpeedMonitorMediator();
        mediator.setCar(car);
        mediator.setBicycle(bicycle);

        car.setMediator(mediator);
        bicycle.setMediator(mediator);

        // Kiểm tra phương tiện
        car.requestCheck();
        System.out.println("----");
        bicycle.requestCheck();
    }
}
