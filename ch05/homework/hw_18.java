// package homework;


public class hw_18 {

    public static void main(String[] args) {

        for(int i = 45; i>=2;i--)
        {
            if (i>2)
            {
                int k=2;
                for (k=2;k<=i;k++){
                    if (i%k==0){
                        break;
                    }
                }
                if (k!=i)
                {
                    continue;
                }
                else{
                    System.out.println("最大質數="+i);
                    break;
                }
            }
        }
    }
}