public class app9_18 //外部類別
{
    public static void main(String args[])
    {   
        // 習慣上會將匿名內部物件擠在短短幾行內
        (new Caaa(){void set_num(int n){num = n;
         System.out.println("num = "+num);}}).set_num(5);    
    }           

    static class Caaa
    {
        int num;
    }
}
