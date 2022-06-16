class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    String color;
    double pi = 3.14; 
    double radius;

    private CCircle()
    {
        System.out.println("private constructor called");
    }
    public CCircle(String str,double r)
    {   
        this();
        color = str;
        radius = r;
    }
    void show()
    {
        System.out.println("color="+color+", Radius"+radius);                 
        System.out.println("area="+pi*radius*radius);
    }

}

public class app9_4
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle("Blue",1.0); // 建立 rect1 物件
        cir1.show();                
    }
}