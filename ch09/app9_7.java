class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    private static int count = 0;
    private static double pi = 3.14; 
    double radius;

    public CCircle()
    {
        this(1.0);    
    }

    public CCircle(double r)
    {
        radius = r;
        count ++;    
    }

    public void show()
    {
        System.out.println("area="+pi*radius*radius);
    }

    public static void show_count()
    {
        System.out.println(count + " object(s) created");
    }
}

public class app9_7
{
    public static void main(String args[])
    {
        CCircle.show_count();                // 用 CCircle 物件 呼叫 show_count()函數
        CCircle cir1 = new CCircle(1.0);  // 呼叫 第八行 的建構元
        CCircle.show_count();               // 用 CCircle 物件 呼叫 show_count()函數

        CCircle cir2 = new CCircle(2.0);  // 呼叫 第12行 的建構元
        CCircle cir3 = new CCircle(4.3);  // 呼叫 第12行 的建構元
        cir3.show_count();                   // 用 crt3 物件 呼叫 show_count()函數

    }
}