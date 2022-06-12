import javax.lang.model.util.ElementScanner6;

public class app7_10
{
    public static void main(String args[])
    {   

        int a=5, b[] = {1,2,3,4};
        show(a);  // 將整數a傳遞show()裡
        show(b);  // 將整數陣列b傳遞到show()
    } 

    public static void show(int i)
    {   
       System.out.println("value ="+i);
    }

    public static void show(int arr[])
    {   
       System.out.print("array =");

       for (int i=0; i<arr.length; i++)
       {
        System.out.print(" "+arr[i]);
       }
       System.out.println();
    }
}