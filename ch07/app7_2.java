public class app7_2
{
    public static void main(String args[])
    {   
        int i;          // 宣告整數變數i，此變數的有效僅止於 main() 函數
        i = star(9);      // 傳入 9 給 star()，並以i接收傳回的數值
        System.out.println(i + " strars printed");
    } 

    public static int star(int n)
    {   
        int i ; // 宣告整數變數 i，此變數的有效範圍僅止於 star() 函數
        for(i=0;i<2*n;i++)
            System.out.print("*");   // 印出 2*n 個星號
        System.out.print("\n");      // 換行
        return 2*n;                     // 傳回整數 2*n
    }
}