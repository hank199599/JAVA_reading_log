class CTriangle
{
    protected int base;
    protected int height;

    protected CTriangle()
    {

    }

    protected CTriangle(int b, int h)
    {
        base = b;
        height = h;
    }

    protected void show()
    {
        System.out.println("base="+base+", height="+height);
    }
}

class CData extends CTriangle
{   
    public CData(int b, int h)
    {
        base = b;
        height = h;
    }
    
    public void area()
    {
        super.show();
        System.out.println("area="+0.5*base*height);
    }
}


class hw10_6 {
    public static void main(String args[])
    {
        CData obj = new CData(3,8);
        obj.area();
    }
}
