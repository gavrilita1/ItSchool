package session9;

public class ContBancar {

    private String titular;
    private int sold;

    private static double dobanda = 0.08;

    public ContBancar(String titular, int sold) {
        this.titular = titular;
        this.sold = sold;
    }

    public void depunere(int suma) {
        if (suma >= 0) {
            sold = sold + suma;
        } else {
            System.out.println("suma negativa");
        }
    }

    public void retragere(int suma) {
        if (suma >= 0) {
            sold = sold - suma;
        } else {
            System.out.println("suma negativa");
        }
    }

    public static void setDobanda(double dobanda) {
        ContBancar.dobanda = dobanda;
    }

    public void getDetails() {
        System.out.println("Titular: " + titular);
        System.out.println("Sold: " + sold);
        System.out.println("Dobanda: " + dobanda);
    }


}
