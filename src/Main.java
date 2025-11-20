
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello to Java!");

        //Variabile
        int age = 29;
        short age2 = 30;
        long number = 22200000000L;
        double weight = 115.0d;
        float weightFloat = 115.5f;
        boolean alive = true;
        char litera = 'A';
        byte something = 0;

        System.out.println("voi printa varsta mea: " + age);
        System.out.println("voi printa age2, nush ce e asta: " + age2);
        System.out.println("voi printa acum number : " + number);
        System.out.println("cantarest: " + weight);
        System.out.println("canteresc mai exact: " + weightFloat);
        System.out.println("sunt in viata? " + alive);
        System.out.println("Prima litera din alfabet este  " + litera);
        System.out.println("printez byte " + something);

        String name = "Rolland";
        System.out.println("ma numesc " + name);

        int numar1 = 10;
        int numar2 = 5;
        int sum;
        sum = numar1 + numar2;
        System.out.println("adunare: " + sum);
        System.out.println(numar1 + numar2);
        int dif = numar1 - numar2;
        System.out.println("scarede: " + dif);
        int mul = numar1 * numar2;
        System.out.println("inmultire: " + mul);
        int sub = numar1 / numar2;
        System.out.println("inpartire: " +sub);
    }
}