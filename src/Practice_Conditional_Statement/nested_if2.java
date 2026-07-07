package Practice_Conditional_Statement;

public class nested_if2
{
    public static void main(String[] args)
    {
        int personage=17;
        String licence="yes";

        if (personage<=18)
        {
            System.out.println("check person age is 18");

            if (licence=="no")
            {
                System.out.println("person is eligible for drive");
            }
            else
            {
                System.out.println("person is NOT eligible for drive");
            }
        }
        else
        {
            System.out.println("person is not eligible for driving");
        }
    }
}
