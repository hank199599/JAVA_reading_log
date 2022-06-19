class CRational   
{
    public int n;
    public int d;
    
    public void setN(int num)
    {
        n = num;
    }

    public void setD(int num)
    {
        d = num;
    }

    public void setND(int num,int den)
    {
        setN(num);
        setD(den);
    }

}

public class hw9_10
{
    public static void main(String args[])
    {
       CRational aaa = new CRational();
       aaa.setN(2);
       aaa.setD(5);
       show(aaa);

    }

    public static void show(CRational rat)
    {
        System.out.println(rat.n+"/"+rat.d);
    }

}