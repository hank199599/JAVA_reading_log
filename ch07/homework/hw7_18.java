public class hw7_18
{
    public static void main(String args[])
    {   
        int arr[] = {75,29,10,38,45,17};

        System.out.println("The average in array arr is "+ avg(arr));
    } 

    public static double avg(int arr[])
    {   
        double total = 0;
        show(arr);

        for (int i = 0; i<arr.length;i++)
            total += (double) arr[i];

        return  (total/arr.length);
    }

    public static void show(int arr[])
    {   
        for (int i = 0; i<arr.length;i++)
            System.out.println("a["+i+"]= "+ arr[i]);

    }
}