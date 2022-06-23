class CShape
{
    protected double area;

    double area()
    {
        return 0;
    }

    static CShape largest(CShape [] shape_list)
    {
        CShape max = new CShape();
        int index = 0;

        for(var i = 0; i<shape_list.length;i++)
        {

            System.out.println("Shape index "+i+", area = "+shape_list[i].area());

            if (shape_list[i].area()>max.area())
            {   
                index = i;
                max = shape_list[i];
            }
        }
        
        System.out.println("Largest one is "+index);
        return max;
    }
}

class CCircle extends CShape
{
    static double pi = 3.14;
    private int radius;

    CCircle(int r)
    {
        radius = r;
    }

    double area()
    {
        return pi*radius*radius;
    }
}


class CSquare extends CShape
{
    private int length;

    CSquare(int l)
    {
        length = l;
    }

    double area()
    {
        return length*length;
    }
}


class CTriangle extends CShape
{
    private int base;
    private int height;

    CTriangle(int b,int h)
    {
        base = b;
        height = h;
    }

    double area()
    {
        return 0.5*base*height;
    }
}

class app_fig_10_3_1 {
    public static void main(String args[])
    {
        CShape shp[] = new CShape[5];
        shp[0] = new CCircle(12);
        shp[1] = new CCircle(21);
        shp[2] = new CSquare(15);
        shp[3] = new CTriangle(12,7);
        shp[4] = new CTriangle(3,18);
        CShape.largest(shp);
    }
}
