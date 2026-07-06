package Constructure;

public class sample2
{
    int num1;
    int num2;
    int num3;

    sample2()
    {
        num1=10;
        num2=20;
        num3=30;

        System.out.println("sample2 constructor running");
    }

    public void add()
    {
        System.out.println(num1+num2+num3);
    }
    public void mul()
    {
        System.out.println(num1*num2);
    }

    public static void main(String[] args)
    {
        sample2 s2= new sample2(); //without parameter user defined
        s2.add();
        s2.mul();
    }
}
