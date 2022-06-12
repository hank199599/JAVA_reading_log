public class hw7_10
{
    public static void main(String args[])
    {   
        int arr[][] ={{5,8},{9,2}};

        for(int i = 0;i<arr.length ;i++)
        {
            System.out.println("The smaller one in number pair of ("+arr[i][0]+","+arr[i][1]+") is "+min(arr[i][0],arr[i][1]));
        }    
    } 

    public static int min(int num1, int num2)
    {
        return num1>num2?num2:num1;
    }
}