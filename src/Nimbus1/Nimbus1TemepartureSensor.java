package Nimbus1;

import Observables.Observable;
import Observables.Sensor;
import Observers.Observer;

public  class Nimbus1TemepartureSensor  extends Sensor {
    public Nimbus1TemepartureSensor(String type, int interval) {

    }

    @Override
    public int read() {
        return Integer.parseInt(RandomSupplier.getRnd().ints(1, 0, 40).toString());
    }




}



