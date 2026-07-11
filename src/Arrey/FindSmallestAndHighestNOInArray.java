package Arrey;

import java.util.Arrays;

public class FindSmallestAndHighestNOInArray
{
    public static void main(String[] args)
    {
        int []ar={30,10,40,50,20};

        Arrays.sort(ar);
        for(int i=1; i>=2; i++)
        {
            System.out.println(ar[i]);
        }
        {
            System.out.println(ar[1]);
        }


    }
}
