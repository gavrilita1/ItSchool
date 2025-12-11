package session8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysExamples {
    public static void main(String[] args) {
//        arrayExample1();
//        arrayExample2();
//        arrayListExample1();
//        linkedListExample();
        comparatii();
    }

    // ----------------------------------------------------------------------
    // Exemplu simplu cu ARRAY-uri (structuri fixe, dimensiune fixa)
    // ----------------------------------------------------------------------
    public static void arrayExample1() {
        // Initializam un array de String-uri
        String[] friends = {"Marcel", "Marcela", "Maria", "Marius"};

        // Accesam valori prin index
        System.out.println("primul prieten: " + friends[2]);

        // Dimensiunea unui array este fixa si se obtine cu .length
        System.out.println("cati prieteni am? " + friends.length);

        // Modificare element la un anumit index
        friends[2] = "Andrei";
        System.out.println("friends pe pozitia 2:" + friends[2]);

        // Afisam intregul array folosind Arrays.toString()
        System.out.println("toti prietenii: " + Arrays.toString(friends));
    }

    // ----------------------------------------------------------------------
    // Exemple importante din clasa Arrays (sort, binarySearch, copyOfRange)
    // ----------------------------------------------------------------------
    public static void arrayExample2() {
        int[] numbers = {12, 3, 5, 1231, 2503};

        // Afisam array-ul initial
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        // Sortarea array-ului
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Cautarea unui element sortat (binary search)
        System.out.println(Arrays.binarySearch(numbers, 12));

        // Acces direct prin index
        System.out.println(numbers[2]);

        // Copiere partiala a unui array (pozitiile 2 - 3)
        int[] numbers2 = Arrays.copyOfRange(numbers, 2, 4);
        System.out.println(Arrays.toString(numbers2));
    }

    // ----------------------------------------------------------------------
    // Exemplu cu ArrayList – dimensiune dinamica, multe metode utile
    // ----------------------------------------------------------------------
    public static void arrayListExample1() {
        // Cream o lista pornind de la o lista existenta
        List<String> friends = new ArrayList<>(Arrays.asList("Marcel", "Marcela", "Ronaldo"));

        // Cream o lista goala
        ArrayList<String> friends2 = new ArrayList<>();

        // Accesam un element dupa index
        System.out.println(friends.get(2));

        // Dimensiunea listei
        System.out.println(friends.size());

        // Adaugam un element pe un index specific (shifteaza elementele din dreapta)
        friends.add(1, "Messi the goat");
        System.out.println(friends.get(1));

        // Adaugam la final
        friends.add("Maria");
        System.out.println(friends.get(4));

        // Adaugare la inceput (disponibil doar la ArrayList din Java 21+, sau in unele IDE-uri)
        friends.addFirst("Marius");
        System.out.println(friends);

        // Modificarea unui element
        friends.set(2, "Messi");
        System.out.println(friends);

        // Stergerea tuturor elementelor
        friends.clear();
        System.out.println(friends);
    }

    // ----------------------------------------------------------------------
    // LinkedList – lista dublu inlantuita, performanta buna la inserari/steargeri
    // ----------------------------------------------------------------------
    public static void linkedListExample() {
        List<String> linked = new LinkedList<>();

        linked.add("Marcel");
        linked.add("Marcela");
        linked.add("Marius");

        // Acces la element dupa index (mai lent decat la ArrayList)
        System.out.println(linked.get(2));

        // Adaugare pe un anumit index
        linked.add(1, "Maria");
        System.out.println(linked);

        // Stergere dupa index
        linked.remove(0);
        System.out.println(linked);
    }

    // ----------------------------------------------------------------------
    // Comparatii intre ArrayList si LinkedList
    // Testam viteza accesului (.get) si a inserarii la inceput
    // ----------------------------------------------------------------------
    public static void comparatii() {
        int size = 50000;

        List<String> arraylist = new ArrayList<>();
        List<String> linked = new LinkedList<>();

        // Populam ambele liste
        for (int i = 0; i <= size; i++) {
            String value = String.valueOf(i);
            arraylist.add(value);
            linked.add(value);
        }

        // ------------------ TEST 1: ACCESS TIME (get) ------------------
        long start = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            arraylist.get(size / 2); // acces rapid in ArrayList
        }
        long stop = System.currentTimeMillis() - start;

        long startLinked = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            linked.get(size / 2); // acces lent in LinkedList (trece prin noduri)
        }
        long stopLinked = System.currentTimeMillis() - startLinked;

        System.out.println(stop);        // timp ArrayList
        System.out.println(stopLinked);  // timp LinkedList

        // ------------------ TEST 2: INSERT AT BEGINNING ------------------
        start = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            arraylist.add(0, "x"); // foarte lent: muta toate elementele la dreapta
        }
        stop = System.currentTimeMillis() - start;

        startLinked = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            linked.add(0, "x"); // foarte rapid: doar leaga nodul nou
        }
        stopLinked = System.currentTimeMillis() - startLinked;

        System.out.println(stop);        // timp ArrayList
        System.out.println(stopLinked);  // timp LinkedList
    }
}
