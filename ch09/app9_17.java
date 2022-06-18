public class app9_17 //外部類別
{
    public static void main(String args[])
    {
        (
            new Caaa()          // 建立匿名內部類別 Caaa的物件
            {
                void set_num(int n) //補足內部類別Caaa裡沒有定義到的函數
                {
                    num = n;
                    System.out.println("num = "+num);
                }
            }
        ).set_num(5);   // 執行匿名內部類別所定義的函數
            
    }           

    static class Caaa
    {
        int num;
    }
}
