class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    private double pi = 3.14; 
    private double radius;


    void show_area()   // show_area()函數：顯示出園面積
    {
        System.out.println("area="+pi*radius*radius);
    }
}

public class app8_13
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(); // 建立rect1物件

        cir1.radius = -2.0;            // 在CCircle類別外部可以設定 radius的值
        cir1.show_area();              // 呼叫 show_area()函數
    }// 
}