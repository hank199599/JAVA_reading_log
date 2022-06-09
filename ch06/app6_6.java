
public class app6_6 {
    public static void main(String[] args) {
        
        int a[] = {2,7,6,3,8,4}; 
        int b[] = {2,7,6,3,8,4}; 
        int c[] = a;
        
        if(a==b) //判斷a與b是否相同
            System.out.println("a=b");
        else
        System.out.println("a!=b");

        if(a==c) //判斷a與c是否相同
            System.out.println("a=c");
        else
        System.out.println("a!=c");
    }
}