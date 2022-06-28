import java.net.PortUnreachableException;

class Caaa
{
    final int sum1;
    final int sum2;
}

class Cbbb extends Caaa
{
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


class hw10_18 {
     public static void main(String[] args) {
        Cbbb bb = new Cbbb();
        bb.set_num(5,10);
        bb.show();
    }
}
