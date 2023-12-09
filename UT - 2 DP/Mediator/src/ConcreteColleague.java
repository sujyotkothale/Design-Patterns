public class ConcreteColleague  implements AbsoluteColleague{
    Mediator m;
    String name;
    ConcreteColleague(String s,Mediator mid){
        m = mid;
        name = s;
    }
    @Override
    public void send(String msg) {
        m.notify(this,msg);
    }

    @Override
    public void getmsg(String msg) {
        System.out.println(name+" got message : "+msg);
    }
    
}
