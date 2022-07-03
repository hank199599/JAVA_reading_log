
interface iVolume
{
    public void showData();
    public double vol();
}

abstract class CShape implements iVolume
{
    final double PI = 3.14;
    protected int x;
    protected int y;
}

class CCircle extends CShape
{   
    public int radius;

    // 請完成這個部分的程式碼
    public CCircle(int num1, int num2, int num3)
    {
        x = num1;
        y = num2;
        radius = num3;
    }

    public void showData()
    {
        System.out.println("球心： ("+x+","+y+")");
        System.out.println("半徑： "+ radius);
        System.out.println("球體積： "+ vol());
    }

    public double vol()
    {   
        double res = (double) 4/3;
        res *= PI*radius*radius*radius;
        return res;
    }    
}

public class hw11_14_a {
    public static void main(String args[])
    {
        CCircle cir = new CCircle(8,6,2);
        cir.showData();
    }
}
