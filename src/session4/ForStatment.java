package session4;

public class ForStatment {
    public static void main(String[] args) {


// ---------------------------------------------------------
// For de baza: parcurgere de la 0 la 10 cu pas de 1
// i incepe de la 0 si creste cu 1 pana ajunge la 10
// ---------------------------------------------------------
        for (int i = 0; i <= 10; i++) {
            System.out.println("numarul curent este: " + i);
        }


// ---------------------------------------------------------
// For cu pas personalizat: i creste cu 2 la fiecare iteratie
// Afiseaza doar numerele pare din interval
// ---------------------------------------------------------
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println("numarul meu este: " + i);
        }


// ---------------------------------------------------------
// Parcurgerea unui sir folosind indexul
// sir.length = dimensiunea sirului
// ---------------------------------------------------------
        int[] sir = {1, 2, 3, 4, 5, 10, 2};
        for (int i = 0; i < sir.length; i++) {
            System.out.println(sir[i]);
        }


// Accesarea unui element specific din sir
        System.out.println(sir[5]); // afiseaza valoarea de la indexul 5 (10)


// ---------------------------------------------------------
// For-each (enhanced for): parcurgere simplificata a sirurilor
// Fiecare element din sir este atribuit variabilei number
// ---------------------------------------------------------
        for (int number : sir) {
            System.out.println("numarul din sir este: " + number);
        }
    }
}

