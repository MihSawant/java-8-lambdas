package third;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public class Order {
    private String id;
    private LocalDateTime dateTime;
    private double qty;
    private double price;

    public Order(LocalDateTime dateTime, double qty, double price){
        this.id = UUID.randomUUID().toString();
        this.dateTime = dateTime;
        this.qty = qty;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){

        return String.format("Order: %s, Date and Time: %s, Qty: %.1f, Price: %.2f", id,
                dateTime.format(myDateFormat()),
                qty, price);
    }

    private DateTimeFormatter myDateFormat(){
        return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    }
}
