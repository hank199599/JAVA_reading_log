class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    private static double pi = 3.14; 
    private double radius;

    public CCircle(double r) // CCircle　建構元
    {
        radius = r;
    }
    
    public void show()
    {
        System.out.println("area="+pi*radius*radius);
    }

}

public class hw9_16
{
    public static void main(String args[])
    {
        CCircle cir[];                  // 宣告類別型態的陣列
        cir = new CCircle[5];           // 利用new配置記憶體空間    
        
        double radius[] = {1.0,4.0,2.0,7.0,5.0};

        for(int i =0;i<cir.length;i++)
        {
            cir[i] = new CCircle(radius[i]);   // 利用 new 產生新的物件，並配置給陣列元素
            cir[i].show();  // 利用物件 cir[1] 呼叫 show() 函數
        }
    }
}
