package session11;

public class Animal {
    public void makeSound(){
        System.out.println("animal makes sounds");
    }
    public void sleep(){
        System.out.println("animal sleeps");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
    @Override
    public void sleep(){
        System.out.println("dog sleeps");
    }
    public void fetch(){
        System.out.println("dog get the ball");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("cats Miau");
    }
    @Override
    public void sleep(){
        System.out.println("cats sleeps");
    }
    public void scratch(){
        System.out.println("cats makes big scratches");
    }
}

class AnimalTest{

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();
        myAnimal.sleep();
//        myAnimal.fetch();
        System.out.println(myAnimal.getClass().getSimpleName());

        try {
            Cat cat = (Cat) myAnimal;
            cat.makeSound();
        }catch (ClassCastException exception){
            System.out.println("Eroare la cast dintre un caine si o pisica " + exception);
        }

        Animal animal = new Cat();
        Cat cat = (Cat) animal;
        cat.makeSound();
        cat.sleep();
        cat.scratch();

        System.out.println(cat instanceof Cat);
        System.out.println(animal instanceof Cat);
        System.out.println(myAnimal instanceof Dog);
    }
}