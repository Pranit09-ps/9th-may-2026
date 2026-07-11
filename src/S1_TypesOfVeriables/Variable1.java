package S1_TypesOfVeriables;

public class Variable1
{
    //example of globle and local variable

    int num3=30;   //global variable

    public void m1()
    {
        int num1=10;                // local variable
        System.out.println(num1);   //calling local variable
        System.out.println(num3);   //caling global variable
    }

    public void m2()
    {
        int num2=20;                // local variable
        System.out.println(num2);   //calling local variable
        System.out.println(num3);   //calling globla variable
    }

    static int num40=40;      //static golbal variable


    public static void main(String[] args)
    {
        Variable1 s1=new Variable1();
        s1.m1();

    }
}
