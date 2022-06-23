class Caaa{
    private int num;

    public Caaa(int n)
    {
        num = n;
    }
}

class app10_12 {
    public static void main(String args[])
    {
        Caaa a = new Caaa(5);
        Caaa b = new Caaa(5);
        Caaa c = a;
        Boolean br1 = a.equals(b);
        Boolean br2 = a.equals(c);
        System.out.println("a.equals(b) = "+br1);
        System.out.println("a.equals(c) = "+br2);
    }
}
