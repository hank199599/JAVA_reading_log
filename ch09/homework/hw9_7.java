class CCount
{
    
    static void power(int x,int n)
    {
        int result=1;
        for( int i =1 ; i<=n;i++)
        result*=x;
        
        System.out.println(x+"^"+n+" = "+result);
    }
}


class hw9_7 {
    public static void main(String args[])
    {
        CCount.power(2,5);
        CCount.power(3,2);
    }    
}
