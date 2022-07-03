interface iAAA
{
    public void show();
}

class Cbbb
{
    public int num = 10;

    public void set( int n)
    {
        num = n;
    }
}

// 請於此處定義Cccc 類別
class Cccc extends Cbbb implements iAAA
{
    public void show()
    {
        System.out.println("num="+num);
    }
}

public class hw11_8 {
    public static void main(String args[])
    {
        Cccc cc = new Cccc();
        cc.set(5);
        cc.show();
    }
}
