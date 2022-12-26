package first;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SimpleLambdas {
    public static void main(String[] args) {
        // Function that supplies "Hi" String
        Supplier<String> supplyString = () -> "Hi";
        // get the string from supplier
        System.out.println(supplyString.get());

        // Consumer
        Consumer<Integer> printNumber = (n) -> System.out.println(n);
        printNumber.accept(50);
    }
}
