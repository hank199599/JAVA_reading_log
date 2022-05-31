public class app3_4 {
    public static void main(String args[])
    {
        int i = java.lang.Integer.MAX_VALUE;
        int sum;
        
        // 印出i的值
        System.out.println("i="+i);

        // 印出i+1的值 -> 發生溢位
        sum = i+1;
        System.out.println("i+1="+sum);

        // 印出i+2的值 -> 發生溢位
        sum = i+2;
        System.out.println("i+2="+sum);
    }
}
