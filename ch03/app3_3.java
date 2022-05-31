public class app3_3 {
    public static void main(String args[])
    {
        long lmax = java.lang.Long.MAX_VALUE;
        int imax = java.lang.Integer.MAX_VALUE;
        // 6、7 行並未指定類別庫「java.lang」仍可得到正確答案
        short smax = Short.MAX_VALUE;
        byte bmax = Byte.MAX_VALUE;

        System.out.println("Max value of long : "+lmax);
        System.out.println("Max value of interger : "+imax);
        System.out.println("Max value of short : "+smax);
        System.out.println("Max value of byte : "+bmax);

    }  
}
