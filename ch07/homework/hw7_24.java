/*
24. 試撰寫一組可以計算三角形面積的多載化函數,格式為 triangle(base, height),
    base 與 height 可同為 int 或 float,傳回值的型態為 float。 ( 三角形面積 = (base*height)/2)
    請計算三角形的底為6高為3及底為4.2,高為33時,面積各是多少?
 */

public class hw7_24
{
    public static void main(String args[])
    {   
        System.out.println("The area of the triangle 1 is "+triangle(6,3));
        System.out.println("The area of the triangle 2 is "+triangle((float)4.2,(float)3.3));
    } 

    public static float triangle(int base, int height)
    {   
        return (float)(base*height)/2;
    }

    public static float triangle(float base, float height)
    {   
        return (base*height)/2;
    }
}