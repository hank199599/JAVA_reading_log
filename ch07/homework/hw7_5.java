public class hw7_5
{
    public static void main(String args[])
    {
        int temp = 20;
        System.out.println("Celsius degree "+temp+" in Fahrenheit is "+fahrenheit(temp)+" degree");
    } 

    public static double fahrenheit(double temp)
    {
        return (9/5)*temp+32;
    }
}