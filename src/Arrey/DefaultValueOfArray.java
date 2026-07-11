package Arrey;

public class DefaultValueOfArray
{
    public static void main(String[] args)
    {
        System.out.println("--print String Array--");

        String[] ar=new String[5];

        ar[0]="abc";
        ar[1]="xyz";

        for(String s1:ar)
        {
            System.out.println(s1);
        }

        System.out.println("--print Int Array--");

        int [] ar1 = new int[5];

        ar1[0]=20;
        ar1[1]=30;
        for(int s2:ar1)
        {
            System.out.println(s2);
        }

        System.out.println("--print char Array--");

        char[] ar3 = new char[5];

        ar3[0]='A';

        for(char s3:ar3)
        {
            System.out.println(s3);
        }

    }

}
