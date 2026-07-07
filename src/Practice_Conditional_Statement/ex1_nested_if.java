package Practice_Conditional_Statement;

public class ex1_nested_if
{
    public static void main(String args[])
    {
        int PEM=370;

        if (PEM>=350)
        {
            System.out.println("Selected in prelin exam");
            System.out.println("Prepering for mains exam");

            int MEM=700;
            if (MEM>=850)
            {
                System.out.println("Selected in Mains exam");
            }
            else
            {
                System.out.println("Rejected from mains exam");
            }
        }
        else
        {
            System.out.println("Rejected in prelin exam");
        }
    }
}
