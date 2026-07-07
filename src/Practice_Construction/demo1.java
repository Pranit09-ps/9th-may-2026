package Practice_Construction;

public class demo1
{
    int num1;
    int num2;

    demo1(int a, int b)
    {
        num1=a;
        num2=b;
        System.out.println("running default constructor method");
    }

    public void add()
    {
        System.out.println(num1+num2);
    }
    public void div()
    {
        System.out.println(num1/num2);
    }
    public void sub()
    {
        System.out.println(num1-num2);
    }
    public void mul()
    {
        System.out.println(num1 * num2);
    }
    public static void main(String[] args)
    {
        demo1 d1 = new demo1(100,200);
        d1.add();
        d1.div();
        d1.sub();
        d1.mul();
    }
}
