package second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambdas {
    public static void main(String[] args) {
        List<String> nerdsList =
               new ArrayList<>(Arrays.asList("mihir", "yash", "hari", "shayan", "azirel", "suresh", "aayan"));

        // list should have names which are starting with a:
        Predicate<String> notStartWithA = string -> !string.startsWith("a");
        nerdsList.removeIf(notStartWithA);
        // print the list using forEach
        Consumer<String> stringConsumer = name -> System.out.println(name);
        nerdsList.forEach(stringConsumer);
    }
}
