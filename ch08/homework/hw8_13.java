class CCircle    // 定義 CRectangle 類別
{
    // 將資料成員設為初值
    double pi = 3.14; 

    double area(double r)   // show_area()函數：顯示出園面積
    {
        return pi*r*r;    
    }

    float area(float r)   // show_area()函數：顯示出園面積
    {
        return (float) pi*r*r;    
    }

    double area( int r)   // show_area()函數：顯示出園面積
    {
        return pi*r*r;    
    }

}

public class hw8_13
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle(); // 建立rect1物件
        
        System.out.println("Input interger : "+cir1.area(2));
        System.out.println("Input float : "+cir1.area(2.2f));
        System.out.println("Input double : "+cir1.area(2.2));
    }
}