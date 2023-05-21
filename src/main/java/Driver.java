import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Driver {

    private Transport transport;
    private String name;

    public Driver(Transport transport, String name) {
        this.transport = transport;
        this.name = name;
    }

    public void start() {
        System.out.println(name + " сел в " + transport.getModel() + " " + transport.getBrand());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport=" + transport +
                ", name='" + name + '\'' +
                '}';
    }
}
