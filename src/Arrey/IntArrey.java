package Arrey;

public class IntArrey
{
    public static void main(String[] args)
    {
        int [] rollnum=new int[4];

        rollnum[0]=30;
        rollnum[1]=10;
        rollnum[2]=40;
        rollnum[3]=20;

        System.out.println(rollnum.length);
        System.out.println(rollnum[2]);

        System.out.println("--print all data--");
        for(int i=0; i<=rollnum.length-1; i++)
        {
            System.out.println(rollnum[i]);
        }

        System.out.println("--print all data from for each loop");
        for(int num1:rollnum)
        {
            System.out.println(num1);
        }
    }
}
