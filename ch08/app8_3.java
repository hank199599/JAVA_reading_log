class CRectangle    // 定義 CRectangle 類別
{
    int width;  // 宣告資料成員 width
    int height; // 宣告資料成員 height

    int area()  // 宣告函數成員 area()，用來計算面積
    {
        return width*height;
    }

    int perimeter() // 宣告函數成員 perimeter()，用來計算周長
    {
        return 2*(width+height);
    }

}

public class app8_3
{
    public static void main(String args[])
    {
        CRectangle rect1;
        rect1 = new CRectangle(); // 建立新的物件

        rect1.width = 20;
        rect1.height = 15;

        System.out.println("area="+ rect1.area() );     // 印出 rect1.width
        System.out.println("perimeter="+ rect1.perimeter() );   // 印出 rect1.height
    }
}