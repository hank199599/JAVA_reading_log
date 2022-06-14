class CRectangle    // 定義 CRectangle 類別
{
    int width;  // 宣告資料成員 width
    int height; // 宣告資料成員 height
}

public class app8_1
{
    public static void main(String args[])
    {
        CRectangle rect1;
        rect1 = new CRectangle(); // 建立新的物件

        rect1.width = 20;
        rect1.height = 15;

        System.out.println("width="+ rect1.width );     // 印出 rect1.width
        System.out.println("height="+ rect1.height );   // 印出 rect1.height

    }
}