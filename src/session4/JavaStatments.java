package session4;

public class JavaStatments {
    public static void main(String[] args) {

        int currentYear = 2025; // anul curent
        int birthYear = 1995; // anul nasterii
        int diffYears = currentYear - birthYear; // varsta persoanei

// ---------------------------------------------------------
// IF - ELSE simplu: verificam daca este minor
// ---------------------------------------------------------
        if (diffYears < 18) {
            System.out.println("sunt minor");
        } else {
            System.out.println("nu sunt minor");
        }

// ---------------------------------------------------------
// IF - ELSE IF - ELSE: evaluam mai multe conditii
// ---------------------------------------------------------
        if (diffYears < 18) {
            System.out.println("sunt minor");
        } else if (diffYears > 70) {
            System.out.println(" oh no,.... winter is comming");
        } else {
            System.out.println(" sunt doar un adult");
        }
    }
}
