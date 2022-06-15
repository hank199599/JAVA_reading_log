class Cbbb
{    
    double x;
    double y;

    void Set_value(double a, double b)
    {
        x = a;
        y = b;
    }
}


public class hw8_2
{
    public static void main(String args[])
    {
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();

        obj1.Set_value(5.2, 3.9);
        obj2.Set_value(6.5, 4.6);
        avg.x = (obj1.x + obj2.x)/2;
        avg.y = (obj1.y + obj2.y)/2;

        System.out.println("In obj1 x = "+obj1.x+", y = "+obj1.y);
        System.out.println("In obj2 x = "+obj2.x+", y = "+obj2.y);
        System.out.println("In avg x = "+avg.x+", y = "+avg.y);
    }
}