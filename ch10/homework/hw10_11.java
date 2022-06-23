class CShape
{
    public double area()
    {
        return 0.0;
    }
}

class CCircle extends CShape
{
    private int radius;
    private static double PI = 3.14;

    public CCircle(int r)
    {
        radius = r;
    }

    public double area()
    {
        return PI*radius*radius;
    }
}

class CSquare extends CShape
{
    private int length;

    public CSquare(int l)
    {
        length = l;
    }

    public double area()
    {
        return length*length;
    }
}

class CTriangle extends CShape
{
    private int base;
    private int height;

    public CTriangle(int b, int h)
    {
        base = b;
        height = h;
    }

    public double area()
    {
        return 0.5*base*height;
    }
}

public class hw10_11 {
    public static void main(String args[])
    {
        CCircle shp_1 = new CCircle(12);
        CCircle shp_2 = new CCircle(21);
        CSquare shp_3 = new CSquare(15);
        CSquare shp_4 = new CSquare(20);
        CTriangle shp_5 = new CTriangle(12,7);
        CTriangle shp_6 = new CTriangle(3,18);

        System.out.println(largest(shp_1,shp_2,shp_3,shp_4,shp_5,shp_6).area());

    }

    public static CShape largest( CShape sh1, CShape sh2,CShape sh3,CShape sh4,CShape sh5,CShape sh6) 
    {

        CShape max = new CShape();
        max = sh1.area()>max.area()?sh1:max;
        max = sh2.area()>max.area()?sh2:max;
        max = sh3.area()>max.area()?sh3:max;
        max = sh4.area()>max.area()?sh4:max;
        max = sh5.area()>max.area()?sh5:max;
        max = sh6.area()>max.area()?sh6:max;

        return max;
    }
}
