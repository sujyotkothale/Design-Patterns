public class App {
    public static void main(String[] args) throws Exception {
        LaptopContext ls=new LaptopContext(new BootState());
        ls.setinfo();
        ls.setstate(new WorkingState());
        ls.setinfo();
        ls.setstate(new ShutdownState());
        ls.setinfo();
    }
}
