public class app3_12 {
    public static void main(String args[])
    {
        int a = 25;     //宣告a為整數 
        int b = 9; //宣告b為符點數

        System.out.println("a="+a+",b="+b);
        System.out.println("a/b="+(a/b)); //當兩個整數相除時，小數點後的數字會被截斷，使運算結果保持為整數
        System.out.println("(float)a/b="+(float)a/b); //若欲輸出結果為浮點數，則需要進行強制轉換型態為浮點數
    }  
}
