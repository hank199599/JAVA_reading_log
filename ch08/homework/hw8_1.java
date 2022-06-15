class Caaa
{
    int a;
    int b;
    int c;
}


public class hw8_1
{
    public static void main(String args[])
    {
        Caaa obj = new Caaa();
        obj.a = 5;
        obj.b = 3;
        obj.c = obj.a*obj.b;
        System.out.println("a="+obj.a);
        System.out.println("b="+obj.b);
        System.out.println("c="+obj.c);
    }
}