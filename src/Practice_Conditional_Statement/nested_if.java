package Practice_Conditional_Statement;

public class nested_if
{
    String Un="abc";
    String PWD="xyz";
    {
        if (Un=="abc")
        {
            System.out.println("Correct UN number");

            if (PWD=="xyz")
            {
                System.out.println("Correct PWD number");
            }
            else
            {
                System.out.println("Wrong PWD number");
            }
        }
        else
        {
            System.out.println("Wrong UN number");
        }
    }
}

