class CRectangle
{
    private int length;
    private int width;

    public CRectangle()
    {
        length = 2;
        width = 2;
    }

    public CRectangle(int l, int w)
    {
        length = l;
        width = w;
    }

    private void show()
    {
        System.out.print("length="+length);
        System.out.print(", width="+width);
    }

    public void area()
    {
        show();
        System.out.println(", area ="+(length*width));
    }

}

class CData extends CRectangle
{   

    public CData()
    {
        super();
    }

    public CData(int l , int w)
    {
        super(l,w);
    }

}


class hw10_4 {
    public static void main(String args[])
    {
        CData obj1 = new CData(3,8);
        CData obj2 = new CData();
        obj1.area();
        obj2.area();
    }
}
