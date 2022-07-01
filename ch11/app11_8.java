class CCircle{ }
class CCoin extends CCircle{ }

public class app11_8 extends CCoin
{
    public static void main(String args[])
    {
        boolean status;
        CCoin coin = new CCoin();
        CCircle cir = new CCircle();
        app11_8 myobj = new app11_8();
        CCoin carr[] = new CCoin[5];

        // 判別 cir 是否為 CCoin 類別或其子類別物件
        status = (cir instanceof CCoin);
        System.out.println("cir instanceof CCoin? "+status);

        // 判別 myobj 是否為 CCircle 類別或其子類別物件
        status = (myobj instanceof CCircle);
        System.out.println("myobj instanceof CCircle? "+status);

        // 判別 coin 是否為 app11_8 類別或其子類別物件
        status = (coin instanceof app11_8);
        System.out.println("coin instanceof app11_8? "+status);

        // 判別 coin 是否為 CCircle 類別或其子類別物件
        status = (coin instanceof CCircle);
        System.out.println("coin instanceof CCircle? "+status);

        // 判別 coin 是否為 CCoin 類別或其子類別物件
        status = (coin instanceof CCoin);
        System.out.println("coin instanceof CCoin? "+status);

        // 判別陣列是否為 Object 類別或其子類別物件
        status = (carr instanceof Object);
        System.out.println("carr instanceof Object? "+status);

        // 判別 cir 是否為 String 類別或其子類別物件
        // status = (cir instanceof String);
        // System.out.println("cir instanceof String? "+status);
        
    }
}
