
public class app6_1 {
    public static void main(String[] args) {
        int i;
        int a[];
        a = new int[3];
        a[0] = 0;
        a[1] = 6;

        for(i=0;i<a.length;i++)
        {
            System.out.println("a["+i+"]="+a[i]+",\t");
        }
    
        System.out.println("\nLength of array = "+a.length);
    }
}
