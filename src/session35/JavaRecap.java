package session35;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class JavaRecap {
    public static void main(String[] args) {
//        PrimitiveDataAndControlFlow.run();
//        StringAndUtilities.run();
//        OopDemo.run();
//        CollenctionsDemo.run();
//        FunctionDemo.run();
    }
}

class PrimitiveDataAndControlFlow {

    public static void run() {
        int age = 35;
        double salary = 3500.0;
        boolean active = true;
        char grade = 'A';

        System.out.println("age: " + age + ", salary : " + salary + " is active : " + active + " and has grade: " + grade);

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        String day = "Friday";
        switch (day) {
            case "Monday" -> System.out.println("start working");
            case "Friday" -> System.out.println("have a good weekend");
            default -> System.out.println("Just a regular day i guess");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(" pasul: " + i);
        }

        int counter = 3;
        while (counter > 0) {
            System.out.println(" counter: " + counter);
            counter--;
        }
    }

}

class StringAndUtilities {

    public static void run() {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" Java");
        builder.append(" students");
        System.out.println(builder);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        Date todayDate = new Date();
        System.out.println(todayDate);
        Timestamp timestamp = new Timestamp(todayDate.getTime());
        System.out.println(timestamp);

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
    }


}

// ----------------------------- OOP -----------------------------

interface Discountable {
    double calculateDiscount();
}

abstract class User {
    protected String name;
    protected int purchases;


    public User(String name, int purchases) {
        this.name = name;
        this.purchases = purchases;
    }

    public void displayInfo() {
        System.out.println("User : " + name + " with " + purchases + " purchases");

    }
}

class StandardUser extends User implements Discountable {

    public StandardUser(String name, int purchases) {
        super(name, purchases);
    }

    @Override
    public double calculateDiscount() {
        return purchases > 3 ? 0.10 : 0.00;
    }
}

class PremiumUser extends User implements Discountable {

    public PremiumUser(String name, int purchases) {
        super(name, purchases);
    }

    @Override
    public double calculateDiscount() {
        return purchases > 3 ? 0.20 : 0.10;
    }
}

class OopDemo {
    public static void run() {
        List<Discountable> users = List.of(
                new StandardUser("Marcel", 2),
                new PremiumUser("Marcela", 5)
        );

        for (Discountable u : users) {
            System.out.println("Disconturi: " + u.calculateDiscount());
        }
        StandardUser standardUser = new StandardUser("Marcel", 4);
        standardUser.displayInfo();
        System.out.println(standardUser.calculateDiscount());
    }
}

// -----------------------------end of OOP -----------------------------

class CollenctionsDemo {
    public static void run() {

        List<String> names = new ArrayList<>();
        names.add("Marcel");
        names.add("Marcela");
        names.add("Marius");
        names.add("Marcel");
        System.out.println(names);

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Pix", 5);
        inventory.put("Stilow", 10);
        inventory.put("Phones", 2);
        System.out.println(inventory);
        inventory.forEach((k, v) -> System.out.println(k + "->" + v));

    }


}

class FunctionDemo {
    public static void run() {

        List<Integer> numbers = List.of(1, 2, 3, 5, 4, 6, 2, 3);

        List<Integer> sortedList = numbers.stream()
                .filter(n -> n >= 3)
                .distinct()
                .sorted()
                .toList();
        System.out.println(sortedList);

        int sumOfNumbers = numbers.stream()
                .filter(n -> n < 5)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sumOfNumbers);

        numbers.forEach( n -> System.out.println("values = " + n) );
        numbers.forEach(System.out::print);
    }
}