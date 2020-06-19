package simpl;

public class CarFactory implements Car{

    @Override
    public Car buy(String name) {
        if (name.equals("baoma")){
            return (Car) new baoma();
        }else if (name.equals("aodi")){
            return (Car) new aodi();
        }else {
            return null;
        }
    }
}
