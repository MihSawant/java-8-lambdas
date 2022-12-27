# Java 8 Lambdas
In this project, I have gone through some basic examples
of Lambda expressions and how to implement functional interface, which was introduced in Java-8

Basic and Important Functional Interfaces:

1. **Consumer< T >** : It returns nothing but takes parameter of type T, like _forEach()_ which accepts consumer.
2. **Supplier< T >** : It takes nothing but returns value which has type T, like Function that just returns value.
3. **Function< T, R >** : It is just like normal function, it accepts value of Type T and Returns value of Type R,
just like **_map()_** function in stream.
4.  **Predicate<T>:** It accepts type T parameter and returns boolean value, _filter()_, in stream accepts a Predicate
and filters value based on that.

5. _Runnable:_ It is also a functional Interface as it has only one
abstract method run(), so we can implement lambda for the same, and write it when needed.