class Caaa {}
class Cbbb extends Caaa{}
class Cccc extends Cbbb{}

public class hw10_10 {
    public static void main(String args[])
    {
        Cbbb b1 = new Cbbb();
        Cbbb b2 = new Cccc();
        Cccc c1 = new Caaa();   //子類別不能建立父類別的記憶體空間
        Cccc c2 = new Cccc();
    }
}
