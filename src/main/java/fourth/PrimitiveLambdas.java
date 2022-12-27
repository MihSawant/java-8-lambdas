package fourth;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveLambdas {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> 5;
        // returns value as primitive type
        System.out.println(intSupplier.getAsInt());

        // converts double value to int and returns int value only
        DoubleToIntFunction areaOfCircle = n -> (int) (n * 3.14);
        int c1 = areaOfCircle.applyAsInt(5);
        System.out.println("Area of Circle with radius 5 = "+c1);

        LongSupplier longSupplier = () -> 513;
        long value = longSupplier.getAsLong();
        System.out.println("Long value = "+value);
    }
}
