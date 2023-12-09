public class App {
    public static void main(String[] args) throws Exception {
        Mediator m = new Mediator();
        ConcreteColleague c1 = new ConcreteColleague("Sujyot",m);
        ConcreteColleague c2 = new ConcreteColleague("Sakshi",m);
        ConcreteColleague c3 = new ConcreteColleague("Yash",m);
        m.add(c1);
        m.add(c2);
        m.add(c3);

        c1.send("hello this is sujyot");
        System.out.println();
        c2.send("hello this is sakshi");
        System.out.println();
        c3.send("hello this is yash");
    }
}
