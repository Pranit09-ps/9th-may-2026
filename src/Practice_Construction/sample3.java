package Practice_Construction;

public class sample3
{
    public void m3()
    {
        System.out.println("Running method m3");
    }
    public void m4() {
        System.out.println("Running method m4");
    }
    public void m5()
    {
        System.out.println("Running method m5");
    }

    public static void main(String[] args)
    {
        sample3 s3= new sample3();
        sample3 s4= new sample3();   //default construture call from same class
        sample3 s5= new sample3();
        sample1 s1= new sample1();  //default construcrue call from diff class
        s1.m1();
        s3.m3();
        s4.m4();
        s5.m5();
    }
}
