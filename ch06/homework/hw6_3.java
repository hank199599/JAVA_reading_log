import java.util.*;

public class hw6_3 {
    public static void main(String[] args) {
        
        int A[] = {53,27,69,12,3,96};
        int odd=0 ,even=0;
        int max_odd=0,max_even=0;

        for (int i = 0;i<A.length;i++)
        {
            System.out.println("A["+i+"]= "+A[i]);
            
            if (A[i]%2==0)
            {
                even++;

                if (A[i]>max_even)
                    {
                        max_even = A[i];
                    }
            }
            else
            {
                odd++;

                if (A[i]>max_odd)
                    {
                        max_odd = A[i];
                    }
            }
        }

        System.out.println("odd count in A = " + odd);
        System.out.println("even count in A = " + even);
        System.out.println("Maximun odd bumber in A is " + max_odd);
        System.out.println("Maximun even bumber in A is " + max_even);
    }
}
