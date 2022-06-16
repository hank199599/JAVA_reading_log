class CTest
{    
    void test(int num)
    {
        if (num == 0)
            System.out.println("此數為0");
        else if (num%2 == 0)
            System.out.println("此數為偶數");
        else 
            System.out.println("此數為奇數");
    }

}


public class hw8_7
{
    public static void main(String args[])
    {
        CTest tester = new CTest();

        tester.test(3);
        tester.test(8);
        tester.test(0);
    }
}