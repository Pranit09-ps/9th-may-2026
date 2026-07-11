package Arrey;

import java.util.Arrays;

public class StringArraySorting
{
    public static void main(String[] args)
    {
        String[] ar = new String[5];

        ar[0]="mahesh";
        ar[1]="arpit";
        ar[2]="saket";
        ar[3]="sankalp";
        ar[4]="arjun";

        System.out.println(ar.length);
        System.out.println(ar[3]);

        System.out.println("--print array before sorting--");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        Arrays.sort(ar);
        System.out.println("-print array after sorting-");


        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }



    }
}
