public class LaptopContext {
    LaptopState s;
    LaptopContext(LaptopState s)
    {
        this.s=s;

    }
    public void setstate(LaptopState s)
    {
        this.s=s;
    }
    public void setinfo()
    {
        s.about();
    }
}
