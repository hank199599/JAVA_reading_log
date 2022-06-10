
public class hw6_4 {
    public static void main(String[] args) {
        
        int array[] = {3,5,0,3,2,4,1,6,8,5,4,3,2};
        int conter=0;

        for (int i = 0;i<array.length;i++)
        {
            if (array[i]>=3 && array[i]<=6)
            {
                conter++;
            }
        }
        System.out.println("Length of the array = " + array.length);
        System.out.println("Items in range from 3 to 6 = " + conter);
    }
}
