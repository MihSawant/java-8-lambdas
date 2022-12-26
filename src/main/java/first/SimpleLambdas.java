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

        // Consumer - print table of n
        Consumer<Integer> printTable = (number) ->{
          for(int i = 1; i <= 10; i++){
              int product = number * i;
              System.out.printf("%d x %d = %d%n", i, number, product);
          }
        };
        // print table of 5
        printTable.accept(21);
    }
}
