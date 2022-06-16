class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    private static double pi = 3.14; 
    private double radius;

    public CCircle(double r)
    {
        radius = r;
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    public void show()
    {
        System.out.println("area="+pi*radius*radius);
    }

}

public class app9_9
{
    public static void main(String args[])
    {
        CCircle cir1, cir2;
        cir1 = new CCircle(1.0);   // 宣告 cir1 , cir2 為類別型態的變數
        cir1.show();                  // 建立新的物件，並將 cir1 指向它

        cir2 = cir1;                  // 將 cir1 設給 cir2 ，此時兩變數所指向的內容相同
        cir2.setRadius(2.0);
        cir2.show();

    }
}