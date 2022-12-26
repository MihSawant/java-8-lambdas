package first;

import java.util.function.Supplier;

public class SimpleLambdas {
    public static void main(String[] args) {
        // Function that supplies "Hi" String
        Supplier<String> supplyString = () -> "Hi";
        // get the string from supplier
        System.out.println(supplyString.get());
    }
}
