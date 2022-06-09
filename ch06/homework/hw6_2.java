
public class hw6_2 {
    public static void main(String[] args) {
        
        int a[] = {18,-51,23,35,10,9,-3,52,81,69};
        int b[] = {28,32,-35,40,73,17,92,32,13,29};
        int sum = 0;

        for (int i = 0 ; i<a.length;i++)
        {
            sum+=a[i]*b[9-i];
        }

        System.out.println("summation = "+sum);
    }
}
