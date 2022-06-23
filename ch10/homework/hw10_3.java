import java.net.PortUnreachableException;

class Caaa
{
    public int sum1;
    public int sum2;

    public Caaa()
    {
        sum1 = 1;
        sum2 = 1;
    }

    public Caaa(int a , int b)
    {
        sum1 = a;
        sum2 = b;
    }

}

class Cbbb extends Caaa
{   

    public Cbbb(int a, int b)
    {
        super(a,b);
    }

    public void set_num(int a , int b)
    {
        sum1 = a;
        sum2 = b;
    }

    public void show()
    {
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
    }
}


class hw10_3 {
     public static void main(String[] args) {
        Cbbb bb = new Cbbb(5,10);
        bb.show();
    }
}
