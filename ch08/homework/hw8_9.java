class CCalculator
{    
    int a;
    int b;
    int c;

    void set_value(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
    }

    void show()
    {
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println();
        System.out.println("add : "+add());
        System.out.println("sub : "+sub());
        System.out.println("mul : "+mul());
        System.out.println("avg : "+avg());
    }

    int add()
    {
        return a+b+c;
    }

    int sub()
    {
        return a-b-c;
    }

    int mul()
    {
        return a*b*c;
    }

    double avg()
    {
        return (a+b+c)/3;
    }
}


public class hw8_9
{
    public static void main(String args[])
    {
        CCalculator obj = new CCalculator();
        
        obj.set_value(25, 3, 7);
        obj.show();
    }
}