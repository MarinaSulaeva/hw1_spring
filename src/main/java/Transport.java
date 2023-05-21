import lombok.*;

@Getter
@Setter
public class Transport {
    private final String model;
    private final String brand;
    private final int yearOfProduction;
    private final String country;
    private String color;
    private int maxSpeed;


    public Transport(String model, String brand, int yearOfProduction, String country, String color, int maxSpeed) {
        this.model = model;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
