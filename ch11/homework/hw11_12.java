interface Data
{
    public void best();
    public void failed();
}

interface Test extends Data
{
    public void showData();
    public double average();
}

class CStu implements Test
{
    protected String name;
    protected int math;
    protected int english;

    public CStu(String str, int num1, int num2)
    {
        name = str;
        math = num1;
        english = num2;
    }

    // 請完成這個部分的程式
    public void best()
    {
        if (math == english)
            System.out.println(name+"的數學跟英文一樣好");
        else if (math >english)
            System.out.println(name+"的數學比英文好");
        else
            System.out.println(name+"的英文比數學好");
    }

    public void failed()
    {
        if (math<60)
            System.out.println(name+"的數學當掉了");
        if (english<60)
            System.out.println(name+"的英文當掉了");
    }

    public void showData()
    {
        System.out.println("姓名： " +name);
        System.out.println("數學成績： "+math);
        System.out.println("英文成績： "+english);
        System.out.println("平均成績： "+average());

    }

    public double average()
    {
        return 0.5*(math+english);
    }

    public void show()
    {
        showData();
        best();
        failed();
    }
}

public class hw11_12 {
    public static void main(String args[])
    {
        CStu stu = new CStu("Judy",58,91);
        stu.show();
    }
}
