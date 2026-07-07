package Practice_Construction;

public class sample8
{
    int num2;
    int num3;

    sample8( int a, int b)
    {
        num2=a;
        num3=b;
    }

    public void add()
    {
        System.out.println(num2+num3);
    }

    public void mul()
    {
        System.out.println(num2*num3);
    }
    public void div()
    {
        System.out.println(num2/num3);
    }

    public static void main(String[] args)
    {
        sample8 s8= new sample8(20,30);
        s8.add();
        s8.mul();
        s8.div();
        sample8 s2= new sample8(20,100);
        s2.add();
        s2.mul();
        s2.div();
        sample8 s3=new sample8(40,50);
        s3.add();
        s3.mul();
        s3.div();
    }
}
