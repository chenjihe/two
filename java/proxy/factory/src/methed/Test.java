package methed;

public class Test {
    public static void main(String[] args) {
        baomaFactory baomaFactory = new baomaFactory();
        Car car = baomaFactory.getCar();
        System.out.println(car);
    }
}
