class CCount
{
    static int cnt;

    public CCount()
    {
        count();
    }

    static void count()
    {
        cnt++;
        System.out.println("Show count = "+cnt);
    }

    public void setZero()
    {
        cnt = 0;
    }

    public void setValue(int n)
    {
        cnt = n;
    }
}


class hw9_5 {
    public static void main(String args[])
    {
        CCount count1 = new CCount();
        CCount count2 = new CCount();
        CCount count3 = new CCount();
        CCount count4 = new CCount();
    }    
}
