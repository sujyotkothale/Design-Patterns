import java.util.ArrayList;

public class Subject extends Thread{
    double value;
    ArrayList<observer> obs;
    Subject(double d){
        this.start();
        value = d;
        obs = new ArrayList<>();
    }
    public void addObserver(observer o){
        obs.add(o);
    }
    public void updateValue(double d){
            value = d;
            updateAll();
    }
    public void updateAll(){
        for(observer o:obs){
            o.checkForUpdates();
        }
    }
}
