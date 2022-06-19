class CRectangle
{
    int width;
    int height;

    public CRectangle()
    {   
        // System.out.println("constructor called");
        // this.width = 10;
        // this.height = 8;
        this(10,8);
    }

    public CRectangle( int w, int h)
    {
        this.width = w;
        this.height = h;
    }

    public void show_value()
    {
        System.out.println("width = "+ width);
        System.out.println("height = "+ height);
    }
}

class hw9_1
{
    public static void main(String args[])
    {
        CRectangle rect1 = new CRectangle();
        rect1.show_value();
    }
}