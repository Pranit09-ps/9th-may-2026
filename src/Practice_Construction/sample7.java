package Practice_Construction;

public class sample7
{
    int num9;
    int num10;

    sample7()
    {
        num9=500;
        num10=50;
        System.out.println("default constructor running");
    }
    public void div()
    {
        System.out.println(num9/num10);
    }
    public void mul()
    {
        System.out.println(num9*num10);
    }

    public void add()
    {
        System.out.println(num9+num10);
    }
    public void sub()
    {
        System.out.println(num9-num10);
    }

    public static void main(String[] args)
    {
        sample7 s7=new sample7();
        s7.div();
        s7.mul();
        s7.add();
        s7.sub();


        sample6 s6=new sample6(); // default constructure call from diff class
        s6.div();
        sample1 s1=new sample1();  //default construcrore call from sample 1 class
        s1.m1();

    }
}
