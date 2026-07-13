package Access_Specifier2;


import Access_Specifier1.Test5;


public class Test7 extends Test5
{

   // protected int num1;

   // protected void m1()
   // {
   //     System.out.println(num1*num1);
   // }

    public static void main(String[] args)
    {
        Test7 t7 =new Test7();
        t7.m1();
        System.out.println(t7.num1);
    }

}
