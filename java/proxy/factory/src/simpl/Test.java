package simpl;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car baoma = carFactory.buy("baoma");
        Car aodi = carFactory.buy("aodi");
        
    }
}
