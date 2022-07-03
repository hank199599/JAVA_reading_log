interface Math
{
    public void show();
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}

interface AdvancedMath
{
    public void mod (int a, int b);
    public void fac (int a);
    public void pow (int a, int b);
}


class Compute implements Math,AdvancedMath
{       
    public int ans;

    public void show()
    {
        System.out.println("ans="+ans);
    }

    public void add(int a, int b)
    {
        ans = a+b;
    }

    public void sub(int a, int b)
    {
        ans = a-b;
    }

    public void mul(int a, int b)
    {
        ans = a*b;
    }

    public void div(int a, int b)
    {
        ans = a/b;
    }

    public void mod(int a, int b)
    {
        ans = a%b;
    }

    public void fac(int a)
    {   
        ans = 1;

        for(int i = 1; i<=a;i++)
        {
            ans *= i;
        }
        
    }

    public void pow(int a, int b)
    {
        ans = 1;

        for(int i = 1; i<=b;i++)
        {
            ans *= a;
        }   
    }

}

public class hw11_9 {
    public static void main(String args[])
    {
        Compute cmp = new Compute();
        cmp.mul(3,5);
        cmp.show();
        cmp.mod(3,5);
        cmp.show();
        cmp.fac(5);
        cmp.show();


    }
}
