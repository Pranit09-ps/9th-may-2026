package S1_TypesOfVeriables;

public class Variable2
{
    //2.example of static global variable
    static int num1=10;       // static global variable
    static int num2=20;
    static int num3=30;

    public static void main(String[] args)
    {
        //static global variable call from same class
        System.out.println(num1);// variable name
        System.out.println(num2);
        System.out.println(num3);


        //Static global variable call from diff class(variable1)

        System.out.println(Variable1.num40);//diffClassName.variableName

        //static globla variable call from diff class(Ex3_Variable)

        System.out.println(Ex3_Variable.num3);


    }
}
