public class hw7_9
{
    public static void main(String args[])
    {   
        int arr[] ={-5,2,0};

        for(int i = 0;i<arr.length ;i++)
        {
            System.out.println("Absolute of "+arr[i]+" is "+abs(arr[i]));
        }    
    } 

    public static int abs(int num)
    {
        return num>0?num:num*-1;
    }
}