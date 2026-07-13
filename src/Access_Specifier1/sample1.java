package Access_Specifier1;

public class sample1
{
    private int num1;

    private sample1()
    {
        num1=10;
    }

    private void m1()
    {
        System.out.println(num1*num1);
    }

    public static void main(String[] args)
    {
        sample1 s1 = new sample1();
        s1.m1();
        System.out.println(s1.num1);
    }
}
