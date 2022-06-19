class Caaa
{
    private int value;

    public Caaa()
    {   
        this(10);
        System.out.println("value = "+value);
    }

    public Caaa(int i)
    {
        value = i;
        System.out.println("valie = "+value);
    }
}



class hw9_3 {
 public static void main(String args[])
 {
    Caaa obj1 = new Caaa();
    Caaa obj2 = new Caaa(12);
 }   
}
