class CRantangle
{
    protected int length;
    protected int width;

    public CRantangle(int l, int w)
    {
        length = l;
        width = w;
    }

    public String toString()
    {
        String str = "length="+length+", width="+width+", area="+length*width;
        return str;
    }

    public String toString( int a, int b)
    {
        if(a>=b) 
            return toString();
        else
            return "Argument error";
    }

}



public class hw10_19 {
 
    public static void main(String args[])
    {
        CRantangle rect = new CRantangle(2,6);
        System.out.println(rect.toString(2,1));
    }

}
