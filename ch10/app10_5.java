class CCircle
{
    protected static double pi=3.14;
    protected double radius;

    public void show()
    {
        System.out.println("area="+pi*radius*radius);
    }
}

class CCoin extends CCircle   // 子類別 CCoin，繼承自 CCircle 類別
{
    private int value;        // 子類別的資料成員

    public CCoin(double r, int v)            // 子類別裡有引數的建構元
    {
        radius = r; // 呼叫父類別中，有引數的建構元，即第23行之建構元
        value = v;        
        System.out.println("radius="+radius+", value="+value);
    }
}

public class app10_5
{
    public static void main(String args[])
    {
        CCoin coin = new CCoin(2.5,10);   // 建立 coin 物件，並呼叫第32行建構元
        coin.show();                           // 呼叫由父類別繼承而來的 show()
    }
}