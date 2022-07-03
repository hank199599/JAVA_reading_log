abstract class Math
{
    protected int ans;
    public static void show()
    {
        System.out.println("ans="+ans);
    }
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}

class Compute extends Math
{
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

}

public class hw11_4 {
    public static void main(String args[])
    {   
        Math mth = new Math(); 
        /*
         * 抽象類別不能被直接呼叫使用
         */
        // Compute cmp = new Compute();
        cmp.mul(3,5);
        cmp.show();
    }
}
