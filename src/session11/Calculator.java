package session11;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public double sum(double a, double b){
        return a + b;
    }
}

class Geometry{

    public double area(double l, double i){
        return l * i;
    }
    public double area(double raza){
        return Math.PI * raza * raza;
    }
}

class Main{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int rez1 = calculator.sum(2,4);
        int rez2 = calculator.sum(3,5,6);
        double rez3 = calculator.sum(1.2, 2.4);

        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);

        System.out.println(    (int)rez3      );  //primitive casting

        Geometry geometry = new Geometry();
        double dreptunghi = geometry.area(2.3, 2.1);
        double cerc = geometry.area(3.2);
        System.out.println(dreptunghi);
        System.out.println(cerc);
    }
}