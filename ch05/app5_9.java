
public class app5_9 {
    public static void main(String[] args) {
       
       int i;

       for (i=1;i<=10;i++){
           if (i%3 ==0)
                continue;
            System.out.println("i="+i);
        }
        System.out.println("when loop interrupt,i="+i);
    }

}
