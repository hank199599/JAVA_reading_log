class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    private static double pi = 3.14; 
    private double radius;

    public CCircle(double r) // CCircle　建構元
    {
        radius = r;
    }
    
    public static double compare(CCircle c[])
    {
        double max = 0.0;
        for(int i =0; i<c.length;i++)
            if(c[i].radius>max)
                max = c[i].radius;
        return max;
        
    }

    public static double average(CCircle c[])
    {
        double sum = 0.0;
        for(int i =0; i<c.length;i++)
            sum += c[i].radius;
        return sum/c.length;

    }
}

public class hw9_15
{
    public static void main(String args[])
    {
        CCircle cir[];                  // 宣告類別型態的陣列
        cir = new CCircle[3];           // 利用new配置記憶體空間    
 
        cir[0] = new CCircle(1.0);   // 
        cir[1] = new CCircle(4.0);   // 利用 new 產生新的物件，並配置給陣列元素
        cir[2] = new CCircle(2.0);   // 

        System.out.println("Largest radius = "+CCircle.compare(cir));
        System.out.println("Average radius = "+CCircle.average(cir));
    }
}
