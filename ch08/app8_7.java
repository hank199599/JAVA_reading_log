class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    double pi = 3.14; 
    double radius;


    void show_area()   // show_area()函數：顯示出園面積
    {
        System.out.println("radius="+radius);
        System.out.println("area="+pi*radius*radius);
    }

    void set_radius(double r)
    {
        radius=r;
    }

}

public class app8_7
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(); // 建立rect1物件
        cir1.set_radius(4.0);  // 設定 radous的值
        cir1.show_area();                 
    }// 
}