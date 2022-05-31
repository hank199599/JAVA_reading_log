public class app3_7 {
    public static void main(String args[])
    {
        char ch1 = '\"';
        char ch2 = '\74';
        char ch3 = '\u003e';
        
        System.out.println(ch1+"Time flies."+ch1);
        System.out.println("\"Time is money\"");
        System.out.println(ch2+"Tomorrow never comes"+ch3);
    }
}
