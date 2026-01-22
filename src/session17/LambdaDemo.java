package session17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface IntSum {
    int sum(int a, int b);
}

@FunctionalInterface
interface IntMultiply {
    int multiply(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        IntSum resultSum = (a, b) -> a + b;
        System.out.println(resultSum.sum(5, 2));

        IntMultiply resultMultiply = (a, b) -> a * b;
        System.out.println(resultMultiply.multiply(2, 3));
    }
}

@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

class CalculateDemo {
    public static void main(String[] args) {
        Calculator sum = (a, b) -> a + b;
        Calculator multy = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("sum " + sum.compute(2, 3));
        System.out.println("multy " + multy.compute(2, 3));
        System.out.println("div " + div.compute(6, 3));
    }
}

@FunctionalInterface
interface GreetingService {
    void greet(String msg);
}

class GreetingServicePractice {
    public static void main(String[] args) {

        GreetingService anonymGreeting = new GreetingService() {
            @Override
            public void greet(String msg) {
                System.out.println("Hello from " + msg);
            }
        };

        GreetingService lambdaGreeting = msg -> System.out.println("Hello from " + msg);

        anonymGreeting.greet("anonym class");
        lambdaGreeting.greet("Lambda expression");
    }
}



class LambdaStandardExample{
    public static void main(String[] args) {

        Runnable noParam = () -> System.out.println("Hello from runnable");
        noParam.run();

        Consumer<String> oneParam = msg -> System.out.println("hello from " + msg);
        oneParam.accept("from consumer");

        List<String> names = new ArrayList<>(List.of("Marcel"));

        Predicate<List> predicate = a -> a.isEmpty();

        System.out.println( predicate.test(names));
    }
}


