class Caaa{
    private int num;

    public Caaa(int n)
    {
        num = n;
    }

    public String toString()
    {
        String str = "toString() called, num="+num;
        return str;
    }

}

class app10_14 {
    public static void main(String args[])
    {
        Caaa a = new Caaa(2);
        System.out.println(a.toString());
        // System.out.println(a); //另一種呼叫方法
    }
}
