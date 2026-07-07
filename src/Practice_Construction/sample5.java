package Practice_Construction;

public class sample5
{
    int num5;
    int num6;

    sample5()
    {
        num5=100;
        num6=50;
        System.out.println("default constructor running");
    }
    public void add()
    {
        System.out.println(num5+num6);
    }
    public void mul()
    {
        System.out.println(num5*num6);
    }
    public void div()
    {
        System.out.println(num5/num6);
    }
    public static void main(String[] args)
    {
        sample5 s2=new sample5();
        s2.add();
        s2.mul();
        s2.div();
    }
}
