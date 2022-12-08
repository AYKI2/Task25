import java.math.BigDecimal;
import java.time.Year;

public class Info {
    private Year date;
    private String model;
    private BigDecimal price;
    private Colour colour;

    public Info() {
    }

    public Info(Year date, String model, BigDecimal price, Colour colour) {
        this.date = date;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public Year getDate() {
        return date;
    }

    public void setDate(Year date) {
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "date=" + date +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour=" + colour +
                '}';
    }
}
