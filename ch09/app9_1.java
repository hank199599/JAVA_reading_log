class CCircle
{
    private double pi = 3.14;
    private double radius;

    public CCircle(double r)
    {
        radius = r;
    }
    public void show()
    {
        System.out.println("radius="+radius+" area="+pi*radius*radius);
    }
}

public class app9_1
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(4.0);
        cir1.show();
    }
}