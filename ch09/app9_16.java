public class app9_16 //外部類別
{
    public app9_16()   // 外部類別的建構元
    {
        Caaa aa = new Caaa();     // 在外部類別的建構元裡    
        aa.set_num(5);         // 建立內部類別的物件
    }

    public static void main(String args[])
    {
        app9_16 obj = new app9_16(); // 呼叫建構元 app9_16 建立外部類別的物件
    }

    static class Caaa    // 定義 Caaa 類別 : 內部類別
    {
        // 外部類別成員
        int num;
        void set_num(int n)
        {
            num = n;
            System.out.println("num = "+num);
        }
    }

}
