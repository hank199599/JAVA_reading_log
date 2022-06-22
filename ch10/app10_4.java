class CCircle
{
    private static double pi=3.14;
    private double radius;

    public CCircle() //父類別裡沒有引數的建構元
    {
        
    }

    public CCircle(double r) //父類別裡有引數的建構元
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
        System.out.println("radius="+radius);
    }
}

class CCoin extends CCircle   // 子類別 CCoin，繼承自 CCircle 類別
{
    private int value;        // 子類別的資料成員

    public CCoin(double r, int v)            // 子類別裡有引數的建構元
    {
        setRadius(r);
        value = v;        
    }
}

public class app10_4
{
    public static void main(String args[])
    {
        CCoin coin1 = new CCoin(2.5,10);   // 建立 coin 物件，並呼叫第32行建構元
    }
}