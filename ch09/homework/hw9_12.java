class CRational   
{
    public int n; // 分子
    public int d; // 分母
    
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

    static public CRational compare(CRational r1, CRational r2)
    {

        if (r1.d == r2.d)
            return r1.n>r2.n? r1:r2;
        else
            return r1.n*r2.d>r2.n*r1.d? r1: r2;
    }

}

public class hw9_12
{
    public static void main(String args[])
    {
       CRational rational1 = new CRational();
       rational1.setND(2, 5);
       System.out.println("R1 = "+show(rational1));

       CRational rational2 = new CRational();
       rational2.setND(4, 7);
       System.out.println("R2= "+show(rational2));

       System.out.print("The biggger on is ");
       System.out.println(show(CRational.compare(rational1, rational2)));

    }

    public static String show(CRational rat)
    {
        return (rat.n+"/"+rat.d);
    }

}