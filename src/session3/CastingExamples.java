package session3;

public class CastingExamples {
    public static void main(String[] args) {

        // ------------------------------------------------------
        // Declararea variabilelor de tipuri diferite pentru exemple de cast
        // ------------------------------------------------------

        float floatVal = 1.0f;              // tip float (32-bit), necesita sufix 'f'
        double doubleVal = 4.0d;            // tip double (64-bit), sufixul 'd' este optional
        byte byteVal = 7;                   // 8-bit, valori intre -128 si 127
        short shortVal = 7;                 // 16-bit
        int intVal = 7;                     // 32-bit
        long longVal = 10;                  // 64-bit
        long longVal2 = 4124124124114124421L; // valoare mare, sufix 'L' obligatoriu

        // ------------------------------------------------------
        // CASTING automat (widening): byte -> short
        // ------------------------------------------------------
        short rez1 = byteVal;               // allowed: tipul short este mai mare decat byte
        System.out.println(rez1);           // afiseaza 7

        // CASTING fortat (narrowing): long -> short
        short rez2 = (short) longVal;       // long 10 incape in short → OK

        // valoare foarte mare → se pierde informatie
        short rez3 = (short) longVal2;      // rezultatul NU va fi numarul original
        System.out.println(rez3);           // afiseaza un numar "trunchiat" dupa overflow

        // ------------------------------------------------------
        // Cast din float la int (se elimina partea zecimala)
        // ------------------------------------------------------
        int rez4 = (int) 1.0f;              // 1.0 → 1
        System.out.println(rez4);

        // Operatie intre long si float → rezultatul este float (promovare automata)
        float rez5 = longVal - floatVal;    // 10 - 1.0f → 9.0f
        System.out.println(rez5);

        // ------------------------------------------------------
        // Afisarea limitelor maxime/minime pentru tipurile int si long
        // ------------------------------------------------------
        intVal = Integer.MAX_VALUE;         // 2,147,483,647
        System.out.println(intVal);

        intVal = Integer.MIN_VALUE;         // -2,147,483,648
        System.out.println(intVal);

        System.out.println(Long.MAX_VALUE); // 9,223,372,036,854,775,807
        System.out.println(Long.MIN_VALUE); // -9,223,372,036,854,775,808

        // ------------------------------------------------------
        // Operatorul % (modulo): restul impartirii
        // ------------------------------------------------------
        System.out.println(10 % 3);         // 10 / 3 → rest 1
        System.out.println(16 % 5);         // 16 / 5 → rest 1
    }
}