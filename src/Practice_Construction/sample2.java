package Practice_Construction;

public class sample2
{
    public void m2()
    {
        System.out.println("Running method m2");
    }

    public static void main(String[] args)
    {
        sample2 s2=new sample2();
        s2.m2();

        sample3 s3= new sample3();  // constructure call from diff class
        s3.m3();

    }
}
