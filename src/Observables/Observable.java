package Observables;

import Observers.Observer;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> itsObservers = new ArrayList();
    public void notifyObservers(int data){
        for (Observer observer: itsObservers)
        {
            observer.update(data);
        }
    }

}
