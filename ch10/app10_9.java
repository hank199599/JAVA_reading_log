class Caaa
{
    protected int num=10;

    public void show()
    {   
        int num = 5;
        System.out.println("this.num="+this.num);
        System.out.println("num="+num);
    }
}

class app10_9 {
    public static void main(String args[])
    {
        Caaa a = new Caaa();
        a.show();
    }
    
}
