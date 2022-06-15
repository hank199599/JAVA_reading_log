class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    private double pi = 3.14; 
    private double radius;

    private double area()
    {
        return pi*radius*radius;
    }

    public void show_area()
    {
        System.out.println("area="+area());
    }

    public void setRadius(double r)
    {
        if (r>0)
        {
            radius = r;
            System.out.println("radius="+radius);
        }
        else
            System.out.println("Input error!");
    }
    
}

public class app8_14
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(); // 建立rect1物件

        cir1.setRadius(-2.0);            // 在CCircle類別外部可以設定 radius的值
        cir1.show_area();              // 呼叫 show_area()函數
    }// 
}