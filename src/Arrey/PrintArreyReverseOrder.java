package Arrey;

public class PrintArreyReverseOrder
{
    public static void main(String[] args)

    {
        int [] ar=new int [5];

        ar[0]=30;
        ar[1]=40;
        ar[2]=20;
        ar[3]=10;
        ar[4]=50;

        System.out.println(ar.length);
        System.out.println(ar[4]);

        System.out.println("--print original data--");

        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("--print all data in reverse order--");

        for(int i=ar.length-1; i>=0; i--)
        {
            System.out.println(ar[i]);
        }

        System.out.println("--print all data in for each loop--");

        for(int num1:ar)
        {
            System.out.println(num1);
        }




    }
}
