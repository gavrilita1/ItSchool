package session3;

public class LogicalOperators {
    public static void main(String[] args) {

        // ------------------------------------------------------
        // Demonstratie operatori logici si relationali in Java
        // ------------------------------------------------------

        // Variabile booleene pentru testarea operatorului NOT (!)
        boolean isPresent = true;       // persoana este prezenta
        boolean isRegistered = false;   // persoana NU este inregistrata

        // Afisam valorile booleene
        System.out.println("isPresent = " + isPresent);       // true
        System.out.println("isRegistered = " + isRegistered); // false

        // Operatorul ! (NOT) inverseaza valoarea booleana
        System.out.println("!isPresent = " + !isPresent);         // false
        System.out.println("!isRegistered = " + !isRegistered);   // true

        // ------------------------------------------------------
        // Operatorii relationali
        // ------------------------------------------------------
        int a = 10;
        int b = 20;
        // Echivalent cu: int a = 10, b = 20;

        // Operatorii relationali returneaza true/false
        System.out.println(a == b);  // false - 10 nu este egal cu 20
        System.out.println(a != b);  // true  - 10 este diferit de 20
        System.out.println(a < b);   // true  - 10 este mai mic decat 20
        System.out.println(a > b);   // false - 10 nu este mai mare decat 20
        System.out.println(a <= b);  // true  - 10 este mai mic sau egal cu 20
        System.out.println(a >= b);  // false - 10 nu este mai mare sau egal cu 20

        // ------------------------------------------------------
        // Instructiunea IF simpla
        // ------------------------------------------------------
        if (a < b) {
            System.out.println("a este mai mic decat b");
        }

        // IF - ELSE: se executa unul dintre blocuri
        if (a <= b) {
            System.out.println("a este mai mic sau egal decat b");
        } else {
            System.out.println("a este mai mare sau egal decat b");
        }

        // IF - ELSE IF - ELSE: structura decizionala cu mai multe ramuri
        if (a > b) {
            System.out.println("a este mai mare decat b");
        } else if (a == b) {
            System.out.println("a este egal cu b");
        } else {
            System.out.println("a este mai mic decat b");
        }

        // ------------------------------------------------------
        // Operatorul ternar ? :
        // (conditie) ? valoareDacaTrue : valoareDacaFalse
        // ------------------------------------------------------

        int x;
        x = (a < b) ? 1 : 2;   // a<b → true → x = 1
        System.out.println("val x = " + x);

        int y;
        y = (a == b) ? 1 : 2;  // a==b → false → y = 2
        System.out.println("val y = " + y);

        boolean w;
        w = (x < y) ? true : false;  // x<y → 1<2 → true
        System.out.println("val w = " + w);
    }
}