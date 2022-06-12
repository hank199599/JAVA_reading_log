import javax.lang.model.util.ElementScanner6;

public class app7_11
{
    public static void main(String args[])
    {   
        star();       // 呼叫11~14行所定義的star()函數
        star(7);      // 呼叫16~21行所定義的star()函數
        star('@',9);  // 呼叫23~28行所定義的star()函數
    } 

    public static void star()
    {   
       star(5);
    }

    public static void star(int n)
    {   
       for(int i=0; i<n; i++)
        System.out.print("*");
       System.out.println();
    }

    public static void star(char ch, int n)
    {   
       for(int i=0; i<n; i++)
        System.out.print(ch);
       System.out.println();
    }
}