class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    private static double pi = 3.14; 
    public double radius;

    public CCircle(double r)
    {
        radius = r;
    }

}

public class hw9_9
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(1.0);   // 宣告 cir1 , cir2 為類別型態的變數
        CCircle cir2= new CCircle(2.0);
        CCircle obj;

        obj = compare(cir1,cir2);
        if (cir1 == obj)
            System.out.println("radius of cir1 is larger");
        else
            System.out.println("radius of cir2 is larger");

    }

    public static CCircle compare(CCircle cir1,CCircle cir2)
    {
        if(cir1.radius == cir2.radius)
            return cir1;
        else
            return cir2;
    }

}