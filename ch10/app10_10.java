class Caaa
{
    public final void show()
    {   
        System.out.println("show() 函數 in class Caaa called");
    }
}

class Cbbb extends Caaa
{
    public void show()
    {
        System.out.println("show() 函數 in class Cbbb called");
    }

}

class app10_10 {
    public static void main(String args[])
    {
        Cbbb b = new Cbbb();
        b.show();
    }
    
}
