
public class app6_4 {
    public static void main(String[] args) {
        int i,j,sum = 0;
        int sale[][] = {{32,35,26,30},{34,30,33,31}};

        for (i=0;i<sale.length;i++)
        {
            System.out.print("\n業務員"+(i+1)+"的業績分別為 ");
            for (j=0;j<sale[i].length;j++)
            {
                System.out.print(sale[i][j]+" ");
                sum+=sale[i][j];
            }
            System.out.println(); //列印換行
        }
        System.out.println("\n總銷售量為 "+sum + "部車");
    }
}