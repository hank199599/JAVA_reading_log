public class hw7_7
{
    public static void main(String args[])
    {
        for(int i = 0;i<=100 ;i++)
        {
            if (even(i) && i%9==0)
                System.out.print(i+" ");
        }    
    } 

    public static Boolean even(int num)
    {
        return num%2==0;
    }
}