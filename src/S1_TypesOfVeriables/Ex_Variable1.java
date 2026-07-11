package S1_TypesOfVeriables;

public class Ex_Variable1
{
    int num1=10;

    public void m20()
    {
        int num3=20;
        System.out.println(num1);
        System.out.println(num3);
    }

    public void  m21()
    {
        int num2=40;
        System.out.println(num2);
        System.out.println(num1);
    }

    public static void main(String[] args)
    {
        Ex_Variable1 s1=new Ex_Variable1();
        s1.m20();
        s1.m21();

    }
}
