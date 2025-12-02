package session5;

public class FlowControl {
    public static void main(String[] args) {
        System.out.println("while: ");
        printNumbersWhile(5);


        System.out.println("do while");
        printNumbersDoWhile(5);


        System.out.println("for: ");
        printNumbersFor(10);


        System.out.println("for each");
        int[] array = {1, 2, 3, 4, 5};
        printNumbersForEach(array);


        System.out.println("matrice");
        int[][] biArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(biArray);


        printJump(5);
    }


    // WHILE rulează atâta timp cât condiția este adevărată
    public static void printNumbersWhile(int number) {
        while (number <= 10) {
            System.out.println("numarul: " + number);
            number++;
        }
    }


    // DO-WHILE rulează cel puțin o dată, apoi verifică condiția
    public static void printNumbersDoWhile(int number) {
        do {
            System.out.println("numarul: " + number);
            number++;
        } while (number <= 10);
    }


    // FOR clasic cu index
    public static void printNumbersFor(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println("numarul: " + i);
        }
    }


    // FOR-EACH parcurge direct fiecare element dintr-un array
    public static void printNumbersForEach(int[] array) {
        for (int number : array) {
            System.out.println("numarul: " + number);
        }
    }


    // Parcurgerea unei matrici (array bidimensional)
    public static void printMatrix(int[][] biArray) {
        for (int[] row : biArray) { // fiecare linie
            for (int number : row) { // fiecare element din linie
                System.out.print(number);
            }
            System.out.println();
        }
    }


    // BREAK oprește complet bucla
    // CONTINUE sare peste iteratia curenta
    public static void printJump(int value) {
        for (int i = 0; i <= 10; i++) {
            if (i == value) {
                break; // întrerupe bucla
            }
            if (i == 2) {
                continue; // sare peste afisare pentru 2
            }
            System.out.println("Numar until value: " + i);
        }
    }
}