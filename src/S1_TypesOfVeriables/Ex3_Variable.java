package S1_TypesOfVeriables;

public class Ex3_Variable
{
    int num1=500;

    public void m1()
    {
        int num2=2000;
        System.out.println(num1);
        System.out.println(num2);
    }

    static int num3=100;     //static global variable

    public static void main(String[] args)
    {
        Ex3_Variable s1=new Ex3_Variable();
        s1.m1();
    }
}
