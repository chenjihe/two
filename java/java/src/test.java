import java.util.Random;

public class test {

    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println(random.nextInt(10));//生成10以内的整数
//        System.out.println(random.nextInt(9)+1);//生成1到9的整数

//        Class<? extends user> aClass = new user().getClass();
//        System.out.println(aClass.getName());
//        System.out.println(aClass.getConstructors());

        Class<user> userClass = user.class;
        Class<? extends user> aClass = new user().getClass();

    }
}
