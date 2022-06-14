class CRectangle    // 定義 CRectangle 類別
{
    int width;  // 宣告資料成員 width
    int height; // 宣告資料成員 height
}

public class app8_2
{
    public static void main(String args[])
    {
        CRectangle rect1,rect2;
        rect1 = new CRectangle(); // 建立新的物件
        rect2 = new CRectangle(); // 建立新的物件

        rect1.width = 20;
        rect1.height = 15;

        rect2.width = 25;
        rect2.height =  rect1.height + 3;

        System.out.println("rect1.wwidth="+ rect1.width );     // 印出 rect1.width
        System.out.println("rect1.wheight="+ rect1.height );   // 印出 rect1.height
        System.out.println("rect2.width="+ rect2.width );     // 印出 rect1.width
        System.out.println("rect2.height="+ rect2.height );   // 印出 rect1.height

    }
}