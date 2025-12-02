package session5;

import java.util.Scanner;


public class SwitchStatement {


    // constante pentru zilele săptămânii (stil recomandat în loc de numere "magice")
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WENDSDAY = 3; // scriere intenționată pentru exemplu
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;


    public static void main(String[] args) {
    // metodele sunt comentate și pot fi apelate oricând
    // printDayOfWeek();
    // printDayOfWeekSimpleEdition();
    // printGrade();
    }


    // ---------------------------------------------------------
    // Metodă care primește text și îl compară cu switch-case
    // ---------------------------------------------------------
    private static void printDayOfWeek() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu ziua: ");
        String day = input.nextLine();


        switch (day) {
            case "Monday":
                System.out.println("is it Monday?");
                System.out.println("today is Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wendsday":
                System.out.println("Wendsday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            default: // se execută dacă niciun caz nu se potrivește
                System.out.println("weekend");
        }
    }


    // ---------------------------------------------------------
    // Varianta simplificată a switch-ului modern (Java 14+)
    // cu săgeți -> în loc de break-uri
    // ---------------------------------------------------------
    private static void printDayOfWeekSimpleEdition() {
        Scanner input = new Scanner(System.in);
        System.out.println("inserati 1-5 numarul zilei");
        int day = input.nextInt();


        switch (day) {
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WENDSDAY -> System.out.println("Wendsday");
            case THURSDAY -> System.out.println("Thursday");
            case FRIDAY -> {
                System.out.println("Friday");
                System.out.println("is it?");
            }
            default -> System.out.println("probabil weekend");
        }
    }

    // ---------------------------------------------------------
    // Exemplu cu note de tip A, B, C, D
    // Convertim litera în uppercase și analizăm caracterul
    // ---------------------------------------------------------
    private static void printGrade() {
        Scanner input = new Scanner(System.in);
        System.out.println("inserati o nota de la A la D");
        char grade = input.nextLine().toUpperCase().charAt(0);


        switch (grade) {
            case 'A' -> System.out.println("bravo");
            case 'B' -> System.out.println("almost");
            case 'C' -> System.out.println("not good");
            case 'D' -> System.out.println("bad");
            default -> System.out.println("eroare la citire");
        }
    }
}