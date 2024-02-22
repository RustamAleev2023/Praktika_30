import java.util.Objects;

public class Car {
    private String name;
    private int year;
    private int price;
    private String colour;
    private int engine;

    public Car(String name, int year, int price, String colour, int engine) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && engine == car.engine && Objects.equals(name, car.name) && Objects.equals(year, car.year) && Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, price, colour, engine);
    }

    @Override
    public String toString() {
        return name + ", year: " + year + ", price: " + price +
                ", colour: " + colour + ", engine: " + engine;
    }
}
