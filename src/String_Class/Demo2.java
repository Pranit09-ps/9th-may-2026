package String_Class;

public class Demo2
{
    public static void main(String[] args)
    {
        String s1="abcaba";
        String s2="velocity";
        String s3="abcd";
        String s4="my name is abc";


        System.out.println(s1.length());
        System.out.println("---");
        System.out.println(s1.indexOf('b'));
        System.out.println(s1.lastIndexOf('a'));

        System.out.println("print data from ");
        System.out.println(s2.substring(2));
        System.out.println(s2.substring(2,3));

        System.out.println("---");
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        System.out.println("-----");
        System.out.println(s3);
        System.out.println(s3.trim());

        System.out.println("----");
        System.out.println(s1.replace("abc","xyz"));
    }
}
