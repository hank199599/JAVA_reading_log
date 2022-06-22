class CCircle
{
    private static double pi=3.14;
    private double radius;

    public CCircle()    //父類別裡沒有引數的建構元
    {
        System.out.println("CCircle() constructor called ");
    }

    public CCircle(double r) //父類別裡有引數的建構元
    {
        System.out.println("CCircle(double r) constructor called ");
        radius = r;
    }

    public void show()
    {
        System.out.println("area="+pi*radius*radius);
    }
}

class CCoin extends CCircle   // 子類別 CCoin，繼承自 CCircle 類別
{
    private int value;        // 子類別的資料成員

    public CCoin()            // 子類別裡沒有引數的建構元
    {
        System.out.println("CCoin() constructor called ");
    }

    public CCoin(double r, int v)            // 子類別裡有引數的建構元
    {
        super(r); // 呼叫父類別中，有引數的建構元，即第23行之建構元
        value = v;        
        System.out.println("CCoin(double r, int v) constructor called ");
    }
}

public class app10_2
{
    public static void main(String args[])
    {
        CCoin coin1 = new CCoin();              // 建立 coin 物件，並呼叫第27行建構元
        CCoin coin2 = new CCoin(2.5,10);   // 建立 coin 物件，並呼叫第32行建構元
        coin1.show();               // 呼叫由父類別繼承而來的 show()
        coin2.show();               // 呼叫由父類別繼承而來的 show()
    }
}