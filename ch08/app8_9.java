class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    double pi; 
    double radius;


    double getRadius()   // getRadius()函數：用來回傳物件的半徑
    {
        return radius;
    }

    void setCircle(double p, double r)
    {
        pi=p;
        radius=r;
    }

}

public class app8_9
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(); // 建立rect1物件
        cir1.setCircle(3.1416,2.0);  // 設定 radous的值
        System.out.println("radius="+cir1.getRadius());                 
    }// 
}