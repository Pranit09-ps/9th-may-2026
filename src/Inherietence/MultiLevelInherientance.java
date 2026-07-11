package Inherietence;

import org.w3c.dom.ls.LSOutput;

public class MultiLevelInherientance
{
    public static void main(String[] args)
    {
        System.out.println("-property of Son1--");

        Son1 s1 = new Son1();
        s1.moibile();
        s1.car();
        s1.money();
        s1.home();

        System.out.println("--property of Son2--");

        Son2 s2 =new Son2();
        s2.bike();
        s2.car();
        s2.money();
        s2.home();

        System.out.println("--property of Son3--");

        Son3 s3 =new Son3();
        s3.car();
        s3.car();
        s3.money();
        s3.home();
    }


}
