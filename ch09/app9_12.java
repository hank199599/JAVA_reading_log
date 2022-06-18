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

public class app9_12
{
    public static void main(String args[])
    {
        CCircle cir[];                  // 宣告類別型態的陣列
        cir = new CCircle[3];           // 利用new配置記憶體空間    
 
        cir[0] = new CCircle(1.0);   // 
        cir[1] = new CCircle(4.0);   // 利用 new 產生新的物件，並配置給陣列元素
        cir[2] = new CCircle(2.0);   // 

        cir[0].show();  // 利用物件 cir[0] 呼叫 show() 函數
        cir[1].show();  // 利用物件 cir[1] 呼叫 show() 函數
        cir[2].show();  // 利用物件 cir[2] 呼叫 show() 函數
    }
}
