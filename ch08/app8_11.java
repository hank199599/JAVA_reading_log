class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    String color;
    double pi = 3.14; 
    double radius;

    void setCircle(String str)
    {
        color = str;
    }
    void setCircle(double r)
    {
        radius = r;
    }
    void setCircle(String str,double r)
    {
        color = str;
        radius = r;
    }
    void show()
    {
        System.out.println("color="+color+", Radius"+radius);                 
        System.out.println("area="+pi*radius*radius);
    }

}

public class app8_11
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(); // 建立rect1物件

        cir1.setCircle("Red");  // 設定 rect1 的 color
        cir1.setCircle(2.0);     // 設定 rect1 的 radius
        cir1.show();    

        cir1.setCircle("Blue",4.0);     // 設定 rect1 的 radius
        cir1.show();               
    }// 
}