package session4;

import java.util.Objects;

public class Memory {
    public static void main(String[] args) {


// ---------------------------------------------------------
// Compararea String-urilor
// == compara REFERINTELE (locatia in memorie)
// equals() compara CONTINUTUL
// ---------------------------------------------------------
        String hello1 = "hello"; // literal in String Pool
        String hello2 = "Hello"; // alt literal, diferit prin majuscula
        String hello3 = new String("Hello"); // obiect NOU creat pe heap


        System.out.println(hello1 == hello2); // false (referinte diferite)
        System.out.println(hello1.equals(hello2)); // false (continut diferit)


        System.out.println(hello2 == hello3); // false (heap vs pool)
        System.out.println(hello2.equals(hello3)); // true (continut identic)


// ---------------------------------------------------------
// Comparare obiecte custom (User)
// ---------------------------------------------------------
        User user1 = new User("Marcel");
        User user2 = new User("Marcel");


        System.out.println(user1 == user2); // false (obiecte diferite)
        System.out.println(user1.equals(user2)); // true (continut identic, equals override)


        User user3 = new User("Marcela");
        System.out.println(user1.equals(user3)); // false (nume diferit)
    }
}


// ---------------------------------------------------------
// Clasa User: definim ce inseamna "egalitate" intre obiecte
// equals() este suprascris pentru a compara doar numele
// ---------------------------------------------------------
class User {


    String firstName; // numele utilizatorului


    public User(String name) {
        this.firstName = name;
    }


    @Override
    public boolean equals(Object o) {
// Verificam daca obiectul este instanta de User
        if (!(o instanceof User user)) return false;
// Comparam campul firstName folosind Objects.equals()
        return Objects.equals(firstName, user.firstName);
    }
}