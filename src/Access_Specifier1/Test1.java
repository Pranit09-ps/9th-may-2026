package Access_Specifier1;

public class Test1
{
    int num2;       //default access specifier

    Test1()         //default access specifier
    {
        num2=20;
    }

    public void m2() //default access specifier
    {
        System.out.println(num2*num2);
    }

    public static void main(String[] args)
    {
        Test1 t = new Test1();
        t.m2();
        System.out.println(t.num2);
    }
}
