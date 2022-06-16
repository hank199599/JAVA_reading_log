class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    private static double pi = 3.14; 
    private double radius;

    public CCircle(double r)
    {
        radius = r;
    }
    
    public void compare(CCircle cir)
    {
        if(this.radius == cir.radius)
            System.out.println("radius are equal.");
        else
            System.out.println("radius are not equal.");
    }

}

public class app9_10
{
    public static void main(String args[])
    {
        CCircle cir1, cir2;
        cir1 = new CCircle(1.0);   // 宣告 cir1 , cir2 為類別型態的變數
        cir2= new CCircle(2.0);
        cir1.compare(cir2);

    }
}