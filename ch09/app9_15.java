public class app9_15 //外部類別
{
    public static void main(String args[])
    {
        Caaa aa = new Caaa();           // 利用new配置記憶體空間    
        aa.set_num(5);;
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
