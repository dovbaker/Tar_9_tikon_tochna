package Nimbus1;

import Observables.Observable;
import Observables.Sensor;
import Observers.Observer;

public class Nimbus1PressureSensor extends Sensor {
    public Nimbus1PressureSensor(String type,int interval) {
    }
    @Override
    public int read() {
        return Integer.parseInt(RandomSupplier.getRnd().ints(1, 950, 1050).toString());
    }

    void check() {
        int temp = read();
        if (temp != lastReading) {
            lastReading = temp;
            notifyObservers(temp);
        }

    }


}
