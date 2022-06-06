
public class app5_8 {
    public static void main(String[] args) {
       
       int i;

       for (i=1;i<=3;i++){
           if (i%3 ==0)
                break;
            System.out.println("i="+i);
        }
        System.out.println("when loop interrupt,i="+i);
    }

}
