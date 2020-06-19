package methed;

public class baomaFactory implements  buyCar{
    @Override
    public Car getCar() {
        return new baoma();
    }
}
