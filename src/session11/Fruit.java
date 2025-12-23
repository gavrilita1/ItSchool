package session11;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Fruit {
    public String taste() {
        return "Fruit has taste";
    }

    public String colour() {
        return "Fruit has colour";
    }
}

class Apple extends Fruit {
    @Override
    public String taste() {
        return "Apple has taste";
    }

    @Override
    public String colour() {
        return "Apple has colour";
    }
}

class Orange extends Fruit {
    @Override
    public String taste() {
        return "Orange has taste";
    }

    @Override
    public String colour() {
        return "Orange has Colour";
    }
}

class FruitTest{
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.taste());
        System.out.println(apple.colour());

        Fruit fruit = new Fruit();
        System.out.println(fruit.taste());
        System.out.println(fruit.colour());

        Fruit fruit1 = new Apple();
        System.out.println(fruit1.taste());
        System.out.println(fruit1.colour());

//        // java.lang.ClassCastException
//        Fruit fruit2 = new Fruit();
//        Orange orange = (Orange) fruit2;
//        System.out.println(orange.taste());
//        System.out.println(orange.colour());


        List linked = new LinkedList<>();
        Deque linkedDeque = new LinkedList<>();

    }
}