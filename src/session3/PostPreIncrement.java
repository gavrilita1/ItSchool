package session3;

public class PostPreIncrement {
    public static void main(String[] args) {

        // -----------------------------
        // POST-INCREMENT: x++
        // -----------------------------
        // Se foloseste valoarea LUI x, apoi x creste cu 1.
        int x = 5;                 // Initial, x = 5
        int y = x++;               // y primeste valoarea veche a lui x (5), apoi x creste -> x devine 6
        System.out.println(x);     // Afiseaza 6 (pentru ca x a fost incrementat DUPA atribuire)
        System.out.println(y);     // Afiseaza 5 (valoarea veche a lui x)

        // -----------------------------
        // PRE-INCREMENT: ++z
        // -----------------------------
        // Mai intai se creste z, apoi se foloseste valoarea lui.
        int z = 5;                 // Initial, z = 5
        int w = ++z;               // z creste imediat -> devine 6; w va primi 6
        System.out.println(z);     // Afiseaza 6 (z a fost incrementat INAINTE de atribuire)
        System.out.println(w);     // Afiseaza 6 (valoarea noua a lui z)

        // -----------------------------
        // POST-DECREMENT: x--
        // -----------------------------
        // Se foloseste valoarea LUI x, apoi x scade cu 1.
        x = 5;                     // Resetam x = 5
        y = x--;                   // y primeste valoarea veche (5), apoi x devine 4
        System.out.println(x);     // Afiseaza 4 (x a fost decrementat DUPA atribuire)
        System.out.println(y);     // Afiseaza 5 (valoarea veche a lui x)

        // -----------------------------
        // PRE-DECREMENT: --z
        // -----------------------------
        // Mai intai z scade cu 1, apoi se foloseste valoarea lui.
        z = 5;                     // Resetam z = 5
        w = --z;                   // z devine 4 imediat; w primeste 4
        System.out.println(z);     // Afiseaza 4
        System.out.println(w);     // Afiseaza 4
    }
}