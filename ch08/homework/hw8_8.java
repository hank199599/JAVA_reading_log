class CTest
{    
    void test(int num)
    {
        if (num == 0)
            System.out.println("此數為0");
        else if (num > 0)
            System.out.println("此數為正數");
        else 
            System.out.println("此數為負數");
    }

}


public class hw8_8
{
    public static void main(String args[])
    {
        CTest tester = new CTest();

        tester.test(-4);
        tester.test(8);
        tester.test(0);
    }
}