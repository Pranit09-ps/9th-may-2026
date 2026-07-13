package Access_Specifier1;

public class Test5
{
   protected int num1;
   protected   Test5()
    {
        num1=30;
    }
    protected void m1()
    {
        System.out.println(num1*num1);
    }

    public static void main(String[] args)
    {
        Test5 t5 = new Test5();
        t5.m1();
        System.out.println(t5.num1);
    }
}
