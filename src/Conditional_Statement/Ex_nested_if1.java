package Conditional_Statement;

public class Ex_nested_if1
{
    public static void main(String[] args)
    {
        String UN="abc";
        String PWD="xyz";

        if (UN=="abc")
        {
            System.out.println("Correct UN number");

            if (PWD=="xyz")
            {
                System.out.println("Correct PWD number");
            }
            else
            {
                System.out.println("Incorrect PWD number");
            }
        }
        else
        {
            System.out.println("Incorrent UN number");
        }
    }
}
