package session3;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // Declaram patru variabile intregi pentru exemple
        int varA = 21; // valoarea de baza A
        int varB = 6; // valoarea de baza B
        int varC = 3; // valoarea de baza C
        int varD = 1; // valoarea de baza D


        // Exemplu de precedenta a operatorilor: impartirea se executa inaintea scaderii
        int rez1 = varA - varB / varC; // echivalent cu: varA - (varB / varC)
        System.out.println("Rez1= " + rez1);
        System.out.println(varA - varB / varC);


        // Folosirea parantezelor pentru a schimba precedenta operatorilor
        int rez2 = (varA - varB) / varC;
        System.out.println("Rez2 = " + rez2);


        // Mai multe operatii executate de la stanga la dreapta, impartirea si inmultirea au aceeasi precedenta
        int rez3 = varA / varC * varD + varB; // (varA / varC) * varD + varB
        System.out.println("Rez3 = " + rez3);


        // Paranteze imbricate pentru controlul ordinii de executie
        int rez4 = varA / (varC * (varD + varB));
        System.out.println("Rez4 = " + rez4);


        // Noi variabile pentru exemple cu operatori compusi
        int a = 2;
        int b = 3;
        int c = 4;


        // Exemplu de operator += care adauga valoarea lui b la a
        System.out.println(a += b); // echivalent cu: a = a + b;


        // Adaugam 2 la valoarea curenta a lui a
        System.out.println(a += 2); // echivalent cu: a = a + 2;


        // Adaugam (b + 13) la valoarea lui a
        System.out.println(a += b + 13); // echivalent cu: a = a + b + 13;


        // Exemplu cu operator *= si expresie mai complexa
        System.out.println(a *= c * 2 + 2); // echivalent cu: a = a * (c * 2 + 2);


        // Demonstratie operatori de incrementare
        a = 1; // resetam variabila


        System.out.println(a++); // afiseaza 1, apoi a devine 2 (post-incrementare)
        System.out.println(a); // afiseaza 2
        System.out.println(++a); // pre-incrementare: mai intai creste la 3, apoi afiseaza
    }
}
