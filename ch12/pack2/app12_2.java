package pack2;

class CCircle
{
    public void show()
    {
        System.out.println("show() called");
    }
}

public class app12_2
{
    public static void main(String args[])
    {
        CCircle cir = new CCircle();
        cir.show();
    }
}