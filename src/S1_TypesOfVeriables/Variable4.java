package S1_TypesOfVeriables;

public class Variable4
{
//example of non-static golbal variable


    int num30=5000;  //non-static golbal variable

    public static void main(String[] args)
    {
        //non-static global varialbe call from same class
        Variable4 s1=new Variable4();  //create object of same class
        //ClassNameObjectName=new ClassName

        System.out.println(s1.num30);
        //SameClassObjectName.VariableName


        //non-static global variable call from diff class
        Variable5 s2=new Variable5();
        {
            System.out.println(s2.num40);
        }

    }
}
