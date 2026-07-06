package Conditional_Statement;

public class Nested_if
{
    public static  void main(String[] args)
    {
        int PEM=350;

        if (PEM>=300)

        {
            System.out.println("selected in prelin exam");
            System.out.println("preparing for mains exam");

            int MEM=850;
            if (MEM>=800)
            {
                System.out.println("selected in main exam");
            }
            else
            {
                System.out.println("rejected from main exam");
            }
        }
        else
        {
            System.out.println("Rejected from prilin ex");
        }
    }
}
