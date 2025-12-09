package session7;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UtilsExamples {
    public static void main(String[] args) {
        // Apelam metodele care demonstreaza utilitarele importante din Java
        localDateExamples();      // lucrul cu date (fara ora)
        localDateTimeExamples();  // lucrul cu date + timp
        randomExample();          // generare numere aleatoare
        mathExamples();           // functii matematice de baza
        durationExamples();       // masurarea duratei dintre doua momente
    }

    // --------------------------------------------------------------
    // LOCALDATE – lucrul cu date calendaristice fara timp (ora)
    // --------------------------------------------------------------
    public static void localDateExamples() {
        // Obtinem data curenta
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

        // Adaugam 10 zile la data curenta
        LocalDate tenDays = today.plusDays(10);
        System.out.println("ten days from now: " + tenDays);

        // Scadem 2 luni si 2 ani
        System.out.println("2 months before: " + today.minusMonths(2));
        System.out.println("2 years before: " + today.minusYears(2));

        // Parsam manual o data dintr-un string folosind un formatter
        String format = "2025-12-09";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // pattern corect
        LocalDate data = LocalDate.parse(format, formatter);
        System.out.println(data);

        System.out.println("Local Date ");
    }

    // --------------------------------------------------------------
    // LOCALDATETIME – lucrul cu data + timp
    // --------------------------------------------------------------
    public static void localDateTimeExamples() {
        // Obtinem data + ora curenta
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // Adaugam 21 de ore
        System.out.println(today.plusHours(21));

        // Parsam o data cu ora dintr-un string (cu pattern corect)
        String dateTimeString = "2025-12-09 19:57";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("formatter : " + parsedDateTime);

        // Formatarea obiectului today in string folosind formatter
        System.out.println(today.format(formatter));

        // Formatare folosind un formatter creat inline
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm")));

        // Cream manual o data in viitor
        LocalDateTime future = LocalDateTime.of(2025, 12, 9, 20, 5);

        // Verificam daca este inainte sau dupa data curenta
        String result = future.isBefore(today) ? "before" : "after";
        System.out.println(" before or after? : " + result);
        System.out.println(future);

        // Conversie intre tipurile vechi de data (java.util.Date) si cele noi
        java.util.Date utilDate = new java.util.Date(); // data + ora curenta
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // doar data

        System.out.println("util date: " + utilDate);
        System.out.println("sql date: " + sqlDate);

        // Timestamp – data + ora pentru baze de date
        Timestamp timestamp = new Timestamp(sqlDate.getTime());
        System.out.println("timestamp: " + timestamp);

        // Formatare folosind API-ul vechi SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String formatted = simpleDateFormat.format(utilDate);
        System.out.println(formatted);
    }

    // --------------------------------------------------------------
    // RANDOM – generare valori aleatorii
    // --------------------------------------------------------------
    public static void randomExample() {
        Random random = new Random();

        // Numar intre 1 si 100
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        // Numar double intre 0.0 si 1.0
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        // Selectarea unui nume aleator dintr-o lista
        String[] name = {"Marcela", "Marcel", "Ion"};
        System.out.println(name[random.nextInt(name.length)]);

        // Valoare boolean aleatorie
        System.out.println(random.nextBoolean());
    }

    // --------------------------------------------------------------
    // MATH – functii matematice statice
    // --------------------------------------------------------------
    public static void mathExamples() {
        int nr1 = 11;
        int nr2 = 32;

        System.out.println(Math.min(nr1, nr2)); // minimul
        System.out.println(Math.max(nr1, nr2)); // maximul
        System.out.println(Math.PI);            // constanta PI
    }

    // --------------------------------------------------------------
    // DURATION – diferenta intre doua momente de timp
    // --------------------------------------------------------------
    public static void durationExamples() {
        LocalDateTime time1 = LocalDateTime.now();

        // Cream un moment de timp foarte indepartat folosind plusDays, plusHours etc.
        LocalDateTime time2 = time1.plusDays(1).plusHours(5).plusMinutes(78612);

        Duration duration = Duration.between(time1, time2);

        System.out.println(duration);             // durata totala (in secunde)
        System.out.println(duration.toHours());   // convertit in ore
        System.out.println(duration.toMinutes()); // convertit in minute
    }
}