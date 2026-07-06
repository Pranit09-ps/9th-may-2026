package Conditional_Statement;

public class if_else
{
    public static void main(String[] args) {
        int marks = 70;

        if (marks >= 65) {
            System.out.println("Distinction");
        } else if (marks >= 60) {
            System.out.println("1st class");
        }
        else if (marks>=50)
        {
            System.out.println("2nd class");
        }
        else if (marks>=35)
        {
            System.out.println("Pass");
        }
        else if (marks<35)
        {
            System.out.println("Fail");
        }
    }
}
