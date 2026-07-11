package Arrey;

public class StrintArrayDeclarationInitizationInSingleArray
{
    public static void main(String[] args)
    {
        String[] ar={"arjun","pranav","swapnil","yogesh","saurabh"};

        System.out.println(ar.length);
        System.out.println(ar[3]);
        System.out.println("--print all data in for loop--");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("--print all data in for each loop--");
        for(String s1:ar)
        {
            System.out.println(s1);
        }
    }
}
