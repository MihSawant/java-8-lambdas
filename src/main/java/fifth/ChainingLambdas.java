package fifth;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println(s);

//        Consumer<String> c3 = s ->{
//          c1.accept(s);
//          c2.accept(s);
//        };

       // First execute c1 consumer then c2, chain them one by other
       Consumer<String> c3 = c1.andThen(c2);
       c3.accept("Hi");

        Predicate<String> isEmpty = s -> s.isEmpty();

        Predicate<String> isPalindrome = s ->{
            String s1 = "";
            for(int i = s.length() - 1; i >= 0; i--){
              s1 += s.charAt(i);
          }
            return s1.equals(s);
        };
//        System.out.println(isPalindrome.test("mom"));
//        System.out.println(isPalindrome.test("mihir"));

        // check for not empty or palindrome
        Predicate<String> emptyAndPalindrome = isEmpty.negate().and(isPalindrome);

        System.out.println(emptyAndPalindrome.test("mo"));
    }
}
