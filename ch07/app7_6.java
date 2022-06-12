public class app7_6
{
    public static void main(String args[])
    {   
        int A[][] = {{17,32,65,27,30},{17,56,12,66}};
        print_mat(A);
    } 

    public static void print_mat(int arr[][])
    {   
        for (int i=0; i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}