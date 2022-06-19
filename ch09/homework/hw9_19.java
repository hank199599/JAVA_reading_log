class Data
{
    private String name;
    private Test score;

    class Test
    {
        int english;
        int math;

        public Test(int eng, int m)
        {
            english = eng;
            math = m;
        }

        public double avg()
        {
            return (english+math)/2;
        }

    }

    public Data(String str, int eng,int m)
    {
        name = str;
        score = new Test(eng,m);
    }

    public void show()
    {
        System.out.println("學生姓名："+name);
        System.out.println("英文成績："+score.english);
        System.out.println("數學成績："+score.math);
        System.out.println("平均成績："+score.avg());
    }

}

class hw9_19
{
    public static void main(String args[])
    {
        Data stu = new Data("Annie",85,92);
        stu.show();
    }
}