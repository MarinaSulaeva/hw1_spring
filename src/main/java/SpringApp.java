import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Driver carDriver = context.getBean("carDriver", Driver.class);
        carDriver.start();

        Driver busDriver = context.getBean("busDriver", Driver.class);
        busDriver.start();

        Driver pickupDriver = context.getBean("pickupDriver", Driver.class);
        pickupDriver.start();



    }
}
