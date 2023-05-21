import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Transport Car() {
        return new Car("Lada", "Vesta", 2020, "Russia", "red", 200);
    }
    @Bean (name = "bus")
    public Transport Bus() {
        return new Bus("DAEWOO", "BS090", 2010, "Japan", "black", 150);
    }
    @Bean (name = "pickup")
    public Transport Pickup() {
        return new Pickup("КамАЗ", "4308-А3", 2005, "Russia", "white", 150);
    }

    @Bean(name = "carDriver")
    public Driver CarDriver(@Qualifier("car") Transport transport) {
        return new Driver(transport, "Victor");
    }
    @Bean(name = "busDriver")
    public Driver BusDriver(@Qualifier("bus") Transport transport) {
        return new Driver(transport, "Ivan");
    }
    @Bean(name = "pickupDriver")
    public Driver PickupDriver(@Qualifier("pickup") Transport transport) {
        return new Driver(transport, "Daria");
    }


}
