package Practice_Construction;

public class sample6
{
    int num7;
    int num8;

    sample6()
    {
        num7=200;
        num8=100;
        System.out.println("sample6 constructor running");
    }

    public void div()
    {
        System.out.println(num7/num8);
    }
    public void mul()
    {
        System.out.println(num7*num8);
    }

    public void add()
    {
        System.out.println(num7+num8);
    }
    public static void main(String[] args)
    {
        sample6 s6= new sample6();
        s6.mul();
        s6.div();
        s6.add();
    }
}
