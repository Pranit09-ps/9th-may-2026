package Arrey;

public class CharArrey
{
    public static void main(String[] args)
    {
        char [] ar =new char[5];
        ar[0]='B';
        ar[1]='A';
        ar[2]='E';
        ar[3]='D';
        ar[4]='E';

        System.out.println(ar.length);
        System.out.println(ar[3]);

        System.out.println("-------");

        for( char grade:ar)
        {
            System.out.println(grade);
        }

        System.out.println("--print all data in for loop--");

        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

    }


}
