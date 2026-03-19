package sesson33;

interface Animal{
    void makeSound();
}

class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Bark Bark");
    }
}

class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Miau Miau");
    }
}

class Lion implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Roar Road");
    }
}

class AnimalFactory{
    public Animal createAnimal(String type){
        if(type.equalsIgnoreCase("dog")){
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (type.equalsIgnoreCase("lion")) {
            return new Lion();
        }
        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal patrocle = factory.createAnimal("dog");
        Animal cartofel = factory.createAnimal("cat");
        Animal lion = factory.createAnimal("lion");

        patrocle.makeSound();
        cartofel.makeSound();
        lion.makeSound();
    }
}
