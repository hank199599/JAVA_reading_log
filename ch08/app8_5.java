class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    double pi = 3.14; 
    double radius;


    void show_area()   // show_area()函數：顯示出園面積
    {
        System.out.print("pi="+pi);
        System.out.println(", area="+pi*radius*radius);
    }
}

public class app8_5
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(); // 建立rect1物件
        CCircle cir2 = new CCircle(); // 建立rect2物件

        cir1.radius = cir2.radius = 2.0;  // 設定 radous的值
        cir2.pi = 3.0;                    // 更改 cir2 的 pi 值\
        cir1.show_area();                 
        cir2.show_area();                 
    }// 
}