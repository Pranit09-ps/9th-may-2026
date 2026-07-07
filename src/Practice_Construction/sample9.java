package Practice_Construction;

public class sample9
{
    int num10;
    int num11;

    sample9(int a, int b)
    {
        num10=a;
        num11=b;
        System.out.println("running default constructor method");
    }
    public void add()
    {
        System.out.println(num10+num11);
    }
    public void div()
    {
        System.out.println(num10/num11);
    }
    public void mul()
    {
        System.out.println(num10*num11);
    }

    public static void main(String[] args)
    {
        sample9 s9=new sample9(30,20);
        s9.add();
        s9.div();
        s9.mul();

    }
}
