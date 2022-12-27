package third;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PlaceOrders {
    public static void main(String[] args) {
        Order o1 = new Order(LocalDateTime.now(), 5, 200.12);
        Order o2 = new Order(LocalDateTime.of(2021, 5, 21, 9, 10),
                3, 450);
        Order o3 = new Order(LocalDateTime.of(2022, 3, 11, 11, 12),
                10, 10000);
        Order o4 = new Order(LocalDateTime.of(2021, 8, 30, 4, 21),
                2, 592);
        Order o5 = new Order(LocalDateTime.of(2022, 9, 14, 8, 15),
                11, 55833);
        Order o6 = new Order(LocalDateTime.of(2022, 10, 22, 12, 56),
                1, 10);
        Order o7 = new Order(LocalDateTime.of(2021, 7, 20, 1, 55),
                6, 87331);

        List<Order> orders = new ArrayList<>(Arrays.asList(o1, o2, o3, o4, o5, o6, o7));
        Function<Order, LocalDateTime> toDate = order -> order.getDateTime();
        List<LocalDateTime> allDates = new ArrayList<>();
        for(Order o : orders){
            LocalDateTime date = toDate.apply(o);
            allDates.add(date);
        }
        orders.forEach(x -> System.out.println(x));
        allDates.forEach(x -> System.out.println(x));

    }
}
