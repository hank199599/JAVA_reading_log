public class hw7_12
{
    public static void main(String args[])
    {   
        int a[] = {75,29,38,45,16};

        System.out.println("The minimun one in array a is "+minimun(a));
    } 

    public static int minimun(int arr[])
    {   
        int minimun = arr[0];
        for (int i = 0; i<arr.length;i++)
        {
            if (arr[i]< minimun)
                minimun = arr[i];
        }

        return minimun;
    }
}