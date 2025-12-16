package session9;

public class Bancomat {
    public static void main(String[] args) {

        ContBancar contBancar1 = new ContBancar("Marcel",1000);
        contBancar1.depunere(100);
        contBancar1.depunere(-100);
        contBancar1.getDetails();
        contBancar1.retragere(50);
        contBancar1.retragere(-20);
        contBancar1.getDetails();

        ContBancar.setDobanda(0.09);
        contBancar1.getDetails();


    }
}
