package Observables;

import Observers.Observer;

public abstract  class Sensor  extends Observable{
    public int lastReading = 0;
    public   int interval = 0;
    public String type="";

    void Sensor(String type, int interval) {};

     void check() {
         int temp = read();
         if (temp != lastReading) {
             lastReading = temp;
             notifyObservers(temp);
         }
     }


     public abstract int read();
}

