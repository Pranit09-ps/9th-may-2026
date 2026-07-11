package Arrey;

import java.util.Arrays;

public class ArreySorting
{
    public static void main(String[] args)
    {
        int [] ar =new int[5];

        ar[0]=40;
        ar[1]=20;
        ar[2]=10;
        ar[3]=30;
        ar[4]=50;

        System.out.println(ar.length);
        System.out.println(ar[3]);

        System.out.println("--print original data--");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("--print original data in ascending order--");

        Arrays.sort(ar);
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("--print all data in descendng order--");

        for(int i=ar.length-1; i>=0; i--)
        {
            System.out.println(ar[i]);
        }
    }
}
