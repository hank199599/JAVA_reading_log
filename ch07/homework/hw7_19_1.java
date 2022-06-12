public class hw7_19_1
{
    public static void main(String args[])
    {   
        int n = 50;

        System.out.println("用迴圈計算第"+n+"個費氏數列= "+ fib(n));
    } 

    public static long fib(int n)
    {   
       long arr[] = new long[n];

       for( int i = 1 ; i<=n;i++)
       {
            if (i<3)
                arr[i-1]  = 1;
            else
                arr[i-1] = arr[i-2]+arr[i-3];
       }

       return arr[arr.length-1];
    }
}