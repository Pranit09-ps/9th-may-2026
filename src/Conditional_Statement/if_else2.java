package Conditional_Statement;

public class if_else2
{
    public static void main(String[] args)
    {
        int marks=30;

        if (marks >= 65)

        {
            System.out.println("Distinction");
        }
        else if (marks >= 60)
        {
            System.out.println("1st class");
        }
        else if (marks >= 50)
        {
            System.out.println("2nd class");
        }
        else if (marks >= 35)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
