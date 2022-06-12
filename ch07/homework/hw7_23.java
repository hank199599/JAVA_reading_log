public class hw7_23
{
    public static void main(String args[])
    {   
        int n = 5;

        System.out.println(rsum(n));
    } 

    public static long rsum(int n)
    {   
        long res = 0;

        for( int i=2;i<=n;i++)
            {
                res += i*(i-1);
                System.out.println(i+" :"+i*(i-1));
            }
        return res;
    }
}