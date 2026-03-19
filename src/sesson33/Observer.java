package sesson33;


import java.util.ArrayList;
import java.util.List;

interface ObserverInterface{
    void update(String message);
}

class NewSubscriber implements ObserverInterface{

    private String name;

    public NewSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " -> am primit stirea: " + message);
    }
}

class NewAgency{
    List<ObserverInterface> observers = new ArrayList<>();

    public void addObserver(ObserverInterface o){
        observers.add(o);
    }

    public void publishNews(String message){
        for (ObserverInterface obs : observers){
            obs.update(message);
        }
    }
}

public class Observer {
    public static void main(String[] args) {
        NewAgency agency = new NewAgency();
        NewSubscriber s1 = new NewSubscriber("Marcel");
        NewSubscriber s2 = new NewSubscriber("Marcela");
        agency.addObserver(s1);
        agency.addObserver(s2);
        agency.publishNews("A aparut un anunt important");
    }
}
