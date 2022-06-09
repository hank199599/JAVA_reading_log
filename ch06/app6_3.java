
public class app6_3 {
    public static void main(String[] args) {
        int i,min,max;
        int a[] = {74,48,30,17,62};

        min = max = a[0];
        System.out.println("Elements in array a are ");

        for (i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
            if (a[i] > max)
            {
                max = a[i];
            }
            if (a[i] < min)
            {
                min = a[i];
            }
        }

        System.out.println("\nMaximum is "+max);
        System.out.println("Minimum is "+min);
    }
}