import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();
        System.out.println("test");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//
//        Vehicle vehicle = (Vehicle)applicationContext.getBean("vehicle");

    }
}
