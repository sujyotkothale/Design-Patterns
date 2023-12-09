import java.util.ArrayList;

public class Mediator {
    ArrayList<AbsoluteColleague> lst;

    Mediator(){
        lst = new ArrayList<>();
    }
    public void add(AbsoluteColleague a){
        lst.add(a);
    }
    public void notify(AbsoluteColleague me,String s){
        for(AbsoluteColleague e:lst){
            if(e == me){
                continue;
            }
            e.getmsg(s);
        }
    }
}
