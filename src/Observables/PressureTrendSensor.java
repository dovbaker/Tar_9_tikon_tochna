package Observables;

import Observers.Observer;
import Util.Trend;

public class PressureTrendSensor extends Observable implements Observer {
    int lastReading1;
    int lastReading2;
    int lastReading3;

    Trend pressureState;
    Trend lastState;

     public Trend Calc(){
         Trend currTrend=new Trend();
         if(lastReading1<lastReading2 &&lastReading2<lastReading3) {

             currTrend.setTrend("RISING ");
         }
         else
             if (lastReading1>lastReading2 &&lastReading2>lastReading3) {

                 currTrend.setTrend("FALLING ");
             }
             else
             {
                 currTrend.setTrend("STABLE ");
             }
         return currTrend;
     }

     public void check(){};
     public void update(int data){};

}
