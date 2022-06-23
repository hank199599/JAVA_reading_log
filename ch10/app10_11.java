class Caaa{
    private int num;

    public Caaa(int n)
    {
        num = n;
    }
}

class app10_11 {
    public static void main(String args[])
    {
        Caaa a = new Caaa(5);
        Class ca = a.getClass();
        System.out.println("Class of obj = "+ca);
    }
}
