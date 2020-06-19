package methed;

public class aidiFactory implements buyCar {
    @Override
    public Car getCar() {
        return new aodi();
    }
}
