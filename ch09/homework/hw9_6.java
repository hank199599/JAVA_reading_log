class CCount
{
    
    static void add2n(int n)
    {
        int sum=0;
        for( int i =1 ; i<=n;i++)
            sum+=i;
        
        System.out.println("1+...+"+n+" = "+sum);
    }
}


class hw9_6 {
    public static void main(String args[])
    {
        CCount.add2n(5);
        CCount.add2n(10);
    }    
}
