import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.annotation.PostConstruct;

@Getter
public class Car extends Transport{

    private static final Type TYPE = Type.CAR;
    public Car(String model, String brand, int yearOfProduction, String country, String color, int maxSpeed) {
        super(model, brand, yearOfProduction, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car " + super.toString();
    }

    @PostConstruct
    private void printMessage(){
        System.out.println(TYPE + " готов к работе");
    }
}
