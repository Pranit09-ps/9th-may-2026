package Practice_Construction;

public class sample4
{
    int num2;
    int num3;

    public void add()
    {
        num2=34;
        num3=20;

        System.out.println(num2+num3);
    }

    public void div()
    {
        System.out.println(num2/num3);
    }

    public void mul()
    {
        System.out.println(num2*num3);
    }

    public static void main(String[] args)
    {
        sample4 s4= new sample4();
        s4.add();
        s4.div();
        s4.mul();
    }
}
