public class hw7_19_2
{
    public static void main(String args[])
    {   
        int n = 50;

        System.out.println("用迴圈計算第"+n+"個費氏數列= "+ fib(n));
    } 

    public static long fib(int n)
    {   
        long res = 0;

        if (n<3)
            res = 1;
        else
            res = fib(n-1) + fib(n-2);

       return res;
    }
}