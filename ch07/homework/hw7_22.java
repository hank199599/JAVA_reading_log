public class hw7_22
{
    public static void main(String args[])
    {   
        int n[][] = {{3,8},{7,4}};

        for (int i=0;i<n.length;i++)
            System.out.println(n[i][0]+"^"+n[i][1]+"= "+ power(n[i][0],n[i][1]));
    } 

    public static long power(int n, int power)
    {   
        long res = 1;

        for( int i=1;i<=power;i++)
            res *= n;
        return res;
    }
}