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

    public Boolean compare(CRational r)
    {

        if (this.d == r.d)
            return this.n>r.n? true:false;
        else
            return this.n*r.d>r.n*this.d? true: false;
    }

    public static void show_compare(CRational r1,CRational r2)
    {
        System.out.print("Is "+show(r1)+" biggger than "+show(r2)+"? ");
        System.out.println(r1.compare(r2));
    }

    public static String show(CRational rat)
    {
        return (rat.n+"/"+rat.d);
    }


}

public class hw9_13
{
    public static void main(String args[])
    {
       CRational rational1 = new CRational();
       rational1.setND(2, 5);
       System.out.println("R1 = "+CRational.show(rational1));

       CRational rational2 = new CRational();
       rational2.setND(4, 7);
       System.out.println("R2= "+CRational.show(rational2));

       CRational.show_compare(rational1, rational2);
       CRational.show_compare(rational2, rational1);
    }

    
}