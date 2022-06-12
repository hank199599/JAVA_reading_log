public class hw7_11
{
    public static void main(String args[])
    {   
        int arr[] = {8,6,9,12,47,55,10};

        System.out.println("Index of arr is odd is "+odd(arr));
    } 

    public static int odd(int arr[])
    {   
        int res = 0;
        for (int i = 0; i<arr.length;i++)
        {
            if (arr[i]%2==1)
                res++;
        }

        return res;
    }
}