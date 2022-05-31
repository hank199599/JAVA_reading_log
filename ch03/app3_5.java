public class app3_5 {
    public static void main(String args[])
    {
        int i = java.lang.Integer.MAX_VALUE;
        
        // 印出i的值
        System.out.println("i="+i);
        // 印出i+1的值-> 會發生溢位
        System.out.println("i+1="+(i+1));

        // 印出i+2的值 -> 在該運算式中整數數值之後加上L，作為強制型態的轉換
        System.out.println("i+2="+(i+2L));

        // 印出i+3的值 -> 在該運算式中整數數值之前加上long，作為強制型態的轉換
        System.out.println("i+2="+((long)i+3));
    }
}
