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

    // 分數相加
    public CRational add(CRational r)
    {   
        CRational result= new CRational();
        if (this.d == r.d)
            result.setND(this.n+r.n,this.d);
        else
            result.setN(this.n*r.d+r.n*this.d);
            result.setD(this.d * r.d);
        
        return result;
    }

    // 分數相減
    public CRational sub(CRational r)
    {   
        CRational result= new CRational();
        if (this.d == r.d)
            result.setND(this.n-r.n,this.d);
        else
            result.setN(this.n*r.d-r.n*this.d);
            result.setD(this.d * r.d);
        
        return result;
    }
    
     // 分數相乘
     public CRational mul(CRational r)
     {   
        CRational result= new CRational();
         
        result.setND(this.n*r.n,this.d*r.d);

        return result;
     }

    // 分數相除
    public CRational div(CRational r)
    {   
        CRational result= new CRational();
        
        result.setND(this.n*r.d,this.d*r.n);

        return result;
    }

}

public class hw9_11
{
    public static void main(String args[])
    {
       CRational rational1 = new CRational();
       rational1.setND(2, 5);
       System.out.println(show(rational1));

       CRational rational2 = new CRational();
       rational2.setND(4, 7);
       System.out.println(show(rational2));

        System.out.println();

       System.out.print(show(rational1)+" + "+show(rational2) +" = ");
       System.out.println(show(rational1.add(rational2)));

       System.out.print(show(rational1)+" - "+show(rational2) +" = ");
       System.out.println(show(rational1.sub(rational2)));

       System.out.print(show(rational1)+" * "+show(rational2) +" = ");
       System.out.println(show(rational1.mul(rational2)));

       System.out.print(show(rational1)+" / "+show(rational2) +" = ");
       System.out.println(show(rational1.div(rational2)));

    }

    public static String show(CRational rat)
    {
        return (rat.n+"/"+rat.d);
    }

}