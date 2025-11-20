public class Main {

    public static void main(String[] args) {
        // Afisam un mesaj simplu la inceputul programului
        System.out.println("Hello to Java!");

        // ==========================
        // DECLARAREA SI INITIALIZAREA VARIABILELOR
        // ==========================

        int age = 29;                 // Tip int -> numere intregi
        short age2 = 30;              // Tip short -> numere intregi mai mici
        long number = 22200000000L;   // Tip long -> numere foarte mari (cu sufix L)
        double weight = 115.0d;       // Tip double -> numere zecimale (precizie mare)
        float weightFloat = 115.5f;   // Tip float -> numere zecimale (cu sufix f)
        boolean alive = true;         // Tip boolean -> true/false
        char litera = 'A';            // Tip char -> un singur caracter
        byte something = 0;           // Tip byte -> numere mici intre -128 si 127

        // Afisarea variabilelor
        System.out.println("Varsta mea este: " + age);
        System.out.println("Alta varsta (short): " + age2);
        System.out.println("Un numar foarte mare (long): " + number);
        System.out.println("Greutate (double): " + weight);
        System.out.println("Greutate mai exacta (float): " + weightFloat);
        System.out.println("Sunt in viata? " + alive);
        System.out.println("Prima litera din alfabet: " + litera);
        System.out.println("Valoare byte: " + something);

        // Variabila de tip String
        String name = "Rolland";
        System.out.println("Ma numesc: " + name);

        // ==========================
        // OPERATII ARITMETICE DE BAZA
        // ==========================

        int numar1 = 10;
        int numar2 = 5;

        int sum = numar1 + numar2;           // Adunare
        int dif = numar1 - numar2;           // Scadere
        int mul = numar1 * numar2;           // Inmultire
        int div = numar1 / numar2;           // Impartire

        System.out.println("Adunare: " + sum);
        System.out.println("Adunare directa: " + (numar1 + numar2));
        System.out.println("Scadere: " + dif);
        System.out.println("Inmultire: " + mul);
        System.out.println("Impartire: " + div);
    }
}
