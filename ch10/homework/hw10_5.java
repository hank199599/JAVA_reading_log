class Caaa
{
    private int num;

    public Caaa()
    {
        num = 2;
    }

    public Caaa(int n)
    {
        num = n;
    }

    public int get()
    {
        return num;
    }
}

class Cbbb extends Caaa
{
    public void show()
    {
        System.out.println("num="+get());
    }
}


class hw10_5 {
    public static void main(String args[])
    {
        Cbbb bb = new Cbbb();
        bb.show();
    }
}
