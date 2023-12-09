public class App {
    public static void main(String[] args) throws Exception {
        ChannelRepo chr = new ChannelRepo();
        Iterator i = chr.getIterator();
        System.out.println(i.getClass());
        while (i.hasNext()) {
            System.out.println("name : "+(String)i.next());
        }

        try {
           // Iterator i2 = new ChannelIterator();
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
}
