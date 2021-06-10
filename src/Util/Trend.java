package Util;

public class Trend {
    String trendState;
    public Trend(String trs) {
        trendState=trs;
    }
    public Trend() {
    }
    public void setTrend (String trS){
        trendState=trS;
    }
    public void setTrend (Trend trendCopy){
        this.trendState=trendCopy.trendState;
    }
}
