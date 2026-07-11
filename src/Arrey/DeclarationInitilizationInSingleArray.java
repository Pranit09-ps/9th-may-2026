package Arrey;

public class DeclarationInitilizationInSingleArray
{
    public static void main(String[] args)
    {
        int[] ar ={30,40,20,10,50};
        System.out.println("--print all data-");
        System.out.println(ar.length);
        System.out.println(ar[2]);

        System.out.println("--print all data in for loop--");
        for(int i=0; i<=ar.length-1; i++)
            System.out.println(ar[i]);

        System.out.println("print all data in for each loop");
        for(int num1:ar)
        {
            System.out.println(num1);
        }
    }
}
