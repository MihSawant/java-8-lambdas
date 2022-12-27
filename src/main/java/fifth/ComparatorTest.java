package fifth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Character> grades = Arrays.asList('c', 'a', 'b', 'e', 'd');

        Comparator<Character> gradeCompare  = (one,  two) -> one.compareTo(two);

        ToIntFunction<Character> toIntValue = c -> (int) c;
        // no boxing and unboxing occurring and good for performance
        Comparator<Character> gradeCompare2 =  Comparator.comparingInt(toIntValue);

        // Grades sorted using Built-In char compareTo method
        grades.sort(gradeCompare);
        grades.forEach(grade -> System.out.print(grade+"\t"));

        System.out.println();

        grades.sort(gradeCompare2);
        grades.forEach(grade -> System.out.print(grade+"\t"));
    }
}
