package This_And_Super_Keywords;

public class Sample1 extends Sample2
{
    int a=20;

    public void m1()
    {
        int a=10;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args)
    {
        Sample1 s1 = new Sample1();
        s1.m1();

    }
}
