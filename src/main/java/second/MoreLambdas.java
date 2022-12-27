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
        nerdsList.removeIf(string -> !string.startsWith("a"));
        // print the list using forEach
        nerdsList.forEach(name -> System.out.println(name));
    }
}
