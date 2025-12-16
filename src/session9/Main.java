package session9;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Marcel", 30);
        Person p2 = new Person("Marius", 37);

        System.out.println("voi printa numele lui p1: " + p1.getName());
        System.out.println("voi printa numele lui p2: " + p2.getName());

        p1.setName("Marcela");
        System.out.println("voi printa numele lui p1: " + p1.getName());
        p2.setAge(38);
        p2.getDetails();
    }
}
