// Vehicle.java
public abstract class Vehicle {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract int getMaxSpeed();

    public void requestCheck() {
        mediator.notify(this);
    }
}
