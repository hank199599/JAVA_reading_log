class Car 
{
    protected String owner;
    protected String id;
    
    public Car(String own, String s)
    {
        owner = own;
        id = s;
    }

    final void show()
    {
        System.out.println("車主姓名："+owner);
        System.out.println("車牌資料："+id);
    }
}

class CColor extends Car
{
    protected String color;

    protected CColor(String own, String s,String clr)
    {
        super(own, s);
        color = clr;
    }

    public void show_item()
    {
        System.out.println("車主姓名："+owner);
        System.out.println("車牌資料："+id);
        System.out.println("車身顏色："+color);
    }
}


public class hw10_17 {
    public static void main(String args[])
    {
        CColor mycar = new CColor("Riaan","A1-2345","Black");
        mycar.show_item();
    }
}
