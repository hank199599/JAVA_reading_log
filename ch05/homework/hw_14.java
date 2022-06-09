// package homework;

public class hw_14 {

    public static void main(String[] args) {
       
        int rope = 3500;
        int day = 0;
        
        while (true)
        {
            rope = rope/2;
            day++;
            if (rope < 3)
            {
                break;
            }
        }
        System.out.println("一共需要"+day+"天");
    }
}