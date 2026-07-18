package Polymorphism;

public class Son extends Father
{
    public void mobile()
    {
        System.out.println("mobile:xiomi");
    }
    public void car()     //Method Overriding
    {
        System.out.println("car:BMW");
    }

    public void money()
    {
        System.out.println("monet:0.5L");
    }

    public void home()
    {
        System.out.println("home:4BHK");
    }


}
