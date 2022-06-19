class Namecard
{
    private String name;
    private String address;
    private Phone data;

    public class Phone
    {
        private String company;
        private String cell;

        public Phone(String s1,String s2)
        {
            company = s1;
            cell = s2;
        }
    }

    public Namecard(String str1,String str2,String str3,String str4)
    {
        name = str1;
        address = str2;
        data = new Phone(str3,str4);
    }

    public void show()
    {
        System.out.println("好友姓名："+name);
        System.out.println("聯絡地址："+address);
        System.out.println("公司電話："+data.company);
        System.out.println("手機號碼："+data.cell);
    }
}


class hw9_17 {
    public static void main(String args[])
    {
        Namecard first = new Namecard("Andy","123City","2345-6789","0911-336600");
        first.show();
    }
    
}
