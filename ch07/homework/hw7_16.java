public class hw7_16
{
    public static void main(String args[])
    {   
        int a[][] = {{2,4,6},{1,3,5},{8,9}};

        System.out.println("The average in array a is "+ Avg(a));
    } 

    public static double Avg(int arr[][])
    {   
        double total = 0;
        int counter = 0;
        
        for (int i = 0; i<arr.length;i++)
        {   
            for (int j = 0; j<arr[i].length;j++)
            {
                total += (double) arr[i][j];
                counter++;
            }
        }
    
        return  (total/counter);
    }
}