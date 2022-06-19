class CWin
{
    static int cnt;
    public String color;
    public int width;
    public int height;

    public CWin()
    {
        this("Red",2,2);
        count();
    }

    static void count()
    {
        cnt++;
    }

    public CWin(String str, int w, int h)
    {
        color = str;
        width = w;
        height = h;
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


class hw9_8 {
    public static void main(String args[])
    {
        CWin cw1 = new CWin();
        CWin cw2 = new CWin("Tellow",1,2);
    }    
}
