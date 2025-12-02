package session5;

public class JavaStatements {
    public static void main(String[] args) {


        String day = "Friday"; // ziua curentă


// ---------------------------------------------------------
// IF - ELSE IF - ELSE: verificăm valoarea variabilei 'day'
// Metoda equals() compară conținutul unui string
// ---------------------------------------------------------
        if (day.equals("Monday")) {
            System.out.println("today is Monday");
        } else if (day.equals("Tuesday")) {
            System.out.println("today is Tuesday");
        } else if (day.equals("Wendsday")) {
            System.out.println("today is Wendsday");
        } else if (day.equals("Thursday")) {
            System.out.println("today is Thursday");
        } else if (day.equals("Friday")) {
            System.out.println("today is Friday");
        } else {
            System.out.println("is weekend !!!");
        }
    }
}
