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
        localDateExamples();
        localDateTimeExamples();
        randomExample();
        mathExamples();
        durationExamples();
    }

    public static void localDateExamples() {
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

        LocalDate tenDays = today.plusDays(10);
        System.out.println("ten days from now: " + tenDays);

        System.out.println("2 months before: " + today.minusMonths(2));
        System.out.println("2 yeats before: " + today.minusYears(2));

//        String format = "2025-12-09";
//        DateTimeFormatter formater = DateTimeFormatter.ofPattern("DD-MM-YYYY");
//        LocalDate data = LocalDate.parse(format, formater);
//        System.out.println(data);

    }

    public static void localDateTimeExamples() {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        System.out.println(today.plusHours(21));

//        String dateTimeString = "2025-12-09 19:57";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
//        LocalDateTime parsedDataTime = LocalDateTime.parse(dateTimeString,formatter);
//        System.out.println(parsedDataTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
        System.out.println(today.format(formatter));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm")));

        LocalDateTime future = LocalDateTime.of(2025, 12, 9, 20, 05);
        String result = future.isBefore(today) ? "before" : "after";
        System.out.println(" before or after? : " + result);
        System.out.println(future);

        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        System.out.println("util date: " + utilDate);
        System.out.println("sql date: " + sqlDate);

        Timestamp timestamp = new Timestamp(sqlDate.getTime());
        System.out.println("timestamp: " + timestamp);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String formated = simpleDateFormat.format(utilDate);
        System.out.println(formated);
    }

    public static void randomExample() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        String[] name = {"Marcela", "Marcel", "Ion"};
        System.out.println(name[random.nextInt(name.length)]);

        System.out.println(random.nextBoolean());
    }

    public static void mathExamples() {
        int nr1 = 11;
        int nr2 = 32;

        System.out.println(Math.min(nr1, nr2));
        System.out.println(Math.max(nr1, nr2));
        System.out.println(Math.PI);
    }

    public static void durationExamples(){
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = time1.plusDays(1).plusHours(5).plusMinutes(78612);
        Duration duration = Duration.between(time1 , time2);
        System.out.println(duration);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
    }

}
