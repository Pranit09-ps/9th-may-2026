package Arrey;

public class StringArrey
{
    public static void main(String[] args)
    {
        String[] ar = new String[5];

        ar[0] = "mahesh";
        ar[1] = "rahesh";
        ar[2] = "ganesh";
        ar[3] = "suresh";
        ar[4] = "naresh";

        System.out.println(ar[2]);
        System.out.println(ar.length);


        System.out.println("---print all data from string arrey---");

        for(int i=0; i<=4; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("--print all data from For Loop String arrey--");

        for(int i=0; i<=ar.length; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("---print all data from For each loop string arrey--");

        for(String s1:ar)
        {
            System.out.println(s1);
        }
    }
}
