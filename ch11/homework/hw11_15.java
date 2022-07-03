class CShape {}
class CCircle extends CShape{}
class CTriangle extends CShape{}
class CCoin extends CCircle{}


public class hw11_15 {
    public static void main(String args[])
    {
        CCircle circle = new CCircle();
        CTriangle triangle = new CTriangle();
        CCoin coin = new CCoin();

        System.out.print("判斷circle是否為CCoin的子類別? ");
        System.out.println(circle instanceof CCoin);

        System.out.print("判斷triangle是否為CShape的子類別? ");
        System.out.println(triangle instanceof CShape);

        System.out.print("判斷coin是否為Object的子類別? ");
        System.out.println(coin instanceof Object);

    }    
}
