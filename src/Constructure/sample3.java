package Constructure;

public class sample3
{
    //defiind constructure with parameter
    int num1;
    int num2;

    sample3(int a, int b)
    {
        num1 = a;
        num2 = b;
    }
    public void add()
    {
        System.out.println(num1 + num2);
    }
    public void mul()
    {
        System.out.println(num1*num2);
    }
    public void div()
    {
        System.out.println(num1/num2);
    }

    public static void main(String[] args)
    {
        sample3 s3 = new sample3(10,20);
        s3.add();
        s3.mul();
        sample3 s2= new sample3(50,240);
        s2.add();
        s2.mul();
        sample3 s4=new sample3(30,500);
        s4.add();
        s4.mul();
        s4.div();
        sample3 s5=new sample3(500,200);
        s5.add();
        s5.mul();
        s5.div();
    }
}
