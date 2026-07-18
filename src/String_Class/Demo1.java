package String_Class;

public class Demo1
{
    public static void main(String[] args)
    {
        String s1="velocity";
        String s2="abc";
        String s3="xyz";
        String s4="my name is abc";
        String s5="";


        System.out.println(s1.length());

        System.out.println(s1.toLowerCase());
        System.out.println(s1);
        System.out.println("----");

        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        System.out.println("--print s2 lower case");

        System.out.println(s2.length());
        System.out.println(s2.toLowerCase());

        System.out.println("------");
        System.out.println(s2.equals(s3));
    }
}
