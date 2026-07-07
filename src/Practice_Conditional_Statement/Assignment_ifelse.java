package Practice_Conditional_Statement;

public class Assignment_ifelse
{
    public static void main(String[] args)
    {
        int shoppingamt=10000;

        if (shoppingamt>50000)
        {
            System.out.println("get 20% discount");
        }

        else if (shoppingamt>20000)
        {
            System.out.println("get 10% discount");
        }
        else if (shoppingamt>10000)
        {
            System.out.println("get 5% discount");
        }
        else if (shoppingamt<10000)
        {
            System.out.println("no discount");
        }
    }
}
