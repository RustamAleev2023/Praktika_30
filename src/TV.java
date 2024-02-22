import java.util.Objects;

public class TV {
   private String model;
   private int year;
   private int price;
   private int size;
   private String producer;

    public TV(String model, int year, int price, int size, String producer) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.size = size;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return year == tv.year && price == tv.price && size == tv.size && Objects.equals(model, tv.model) && Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, price, size, producer);
    }

    @Override
    public String toString() {
        return model + ", year: " + year +
                ", price: " + price +
                ", size: " + size +
                ", producer: " + producer;
    }
}
