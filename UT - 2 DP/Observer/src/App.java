public class App {
    public static void main(String[] args) throws Exception {
        Subject s = new Subject(10);
        integerOB io = new integerOB(s);
        floatOB fo = new floatOB(s);
        s.addObserver(io);
        s.addObserver(fo);
        io.checkForUpdates();
        fo.checkForUpdates();
        s.updateValue(25.6);
        Thread.sleep(100);

        s.updateValue(20.6);

        Thread.sleep(100);

        s.updateValue(80.69);
    }
}
