class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    String color;
    double pi = 3.14; 
    double radius;

    void setColor(String str)
    {
        color = str;
    }
    void setRadius(double r)
    {
        radius = r;
    }
    void setAll(String str,double r)
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

public class app8_10
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(); // 建立rect1物件

        cir1.setColor("Red");  // 設定 rect1 的 color
        cir1.setRadius(2.0);     // 設定 rect1 的 radius
        cir1.show();    

        cir1.setAll("Blue",4.0);     // 設定 rect1 的 radius
        cir1.show();               
    }// 
}