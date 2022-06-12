public class hw7_14
{
    public static void main(String args[])
    {   
        int a[][] = {{75,29,10},{38,45,16}};

        System.out.println("The Maximun one in array a is "+Maximun(a));
    } 

    public static int Maximun(int arr[][])
    {   
        int Maximun = arr[0][0];
        for (int i = 0; i<arr.length;i++)
        {   
            for (int j = 0; j <arr[i].length;j++)
            {
            if (arr[i][j]> Maximun)
                Maximun = arr[i][j];
            }
        }

        return Maximun;
    }
}