class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    double pi = 3.14; 
    double radius;

    public CCircle(double r)
    {
        radius = r;    
    }

    void show()
    {
        System.out.println("area="+pi*radius*radius);
    }

}

public class app9_5
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(1.0); // 建立 rect1 物件
        cir1.show();                        // show()必須透過物件來呼叫

        CCircle cir2 = new CCircle(2.0); // 建立 rect2 物件
        cir2.show();                        // show()必須透過物件來呼叫

    }
}