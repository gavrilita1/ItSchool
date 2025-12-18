package session10;

public class TipuriMostenire {
}

//mostenire simpla
class A{}

class B extends A{}

//mostenire multi lvl
class Building{}

class Apartament extends Building{}

class Room extends Apartament{}

//mostenire ierarhica
class Supercar{}

class Ferrari extends Supercar{}

class Lamborghini extends Supercar{}

//problema diamantului

//class Shape{}
//
//class Square extends Shape{
//    public void latura(){
//        System.out.println("latura patrat");
//    }
//}
//class Dreptunghi extends Shape{
//    public void latura(){
//        System.out.println("latura dreptunghi");
//    }
//}
//
//class Paralelipiped extends Square, Dreptunghi{
//
//}
//
//public static void main(String[] args) {
//    Paralelipiped p1 = new Paralelipiped();
//    p1.latura();
//}