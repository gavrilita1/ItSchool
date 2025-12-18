package session10;

public class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{

    private String race;

    public Dog(String name, String race){
        super(name);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void sound(){
        System.out.println("My dog barks!");
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Patrocle","Pechinez");
        System.out.println(dog1.getName());
        System.out.println(dog1.getRace());
        dog1.setName("Teriblex");
        dog1.setRace("Chiuaua");
        System.out.println(dog1.getName());
        System.out.println(dog1.getRace());
    }
}