class Caaa
{
    protected int num;

    public void show()
    {
        System.out.println("Caaa_num="+num);
    }
}

class Cbbb extends Caaa
{
    int num = 10;

    public void show()
    {
        super.num = 20;
        System.out.println("Cbbb_num="+num);
        super.show();
    }
}

class app10_8 {
    public static void main(String args[])
    {
        Cbbb b = new Cbbb();
        b.show();
    }
    
}
