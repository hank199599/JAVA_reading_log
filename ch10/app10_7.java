class CCircle
{
    protected static double pi=3.14;
    protected double radius;

    public CCircle(double r)            // 子類別裡有引數的建構元
    {
        radius = r; // 呼叫父類別中，有引數的建構元，即第23行之建構元
    }

    public void show() // 父類別裡的show()函數
    {
        System.out.println("area="+pi*radius*radius);
    }
}

class CCoin extends CCircle   // 子類別 CCoin，繼承自 CCircle 類別
{
    private int value;        // 子類別的資料成員

    public CCoin(double r, int v)            // 子類別裡有引數的建構元
    {
        super(r); // 呼叫父類別中，有引數的建構元，即第23行之建構元
        value = v;        
    }

    public void show()  // 子類別裡的show()函數
    {
        System.out.println("radius="+radius+", value="+value);
    }

    public void showValue()  // 子類別裡的show()函數
    {
        System.out.println("value="+value);
    }
}

public class app10_7
{
    public static void main(String args[])
    {
        CCircle cir = new CCoin(2.5,10);   // 建立 coin 物件，並呼叫第32行建構元
        cir.show();                             // 呼叫由父類別繼承而來的 show()
    }
}