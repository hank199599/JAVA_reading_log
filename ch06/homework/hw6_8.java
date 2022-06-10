
public class hw6_8 {
    public static void main(String[] args) {
        
        double temp[][] = {{18.2,17.3,15.0,13.4},
                           {23.8,25.1,20.6,17.8},
                           {20.6,21.5,18.4,15.7}};

        String day[] ={"星期一","星期二","星期三","星期四"};
        String section[] ={"時段一","時段二","時段三"};
        
        double day_total[] = new double[4];
        
        double max = temp[0][0],min = temp[0][0];
        int max_i=0,max_j=0;
        int min_i=0,min_j=0;

        System.out.print("　　　\t ");
        
        for (int i=0;i<day.length;i++)
        {
            System.out.print(day[i]+"\t ");
        }
        System.out.println();

        for (int i = 0; i<temp.length;i++)
        {   
            System.out.print(section[i]+"\t ");
            for (int j = 0; j<temp[i].length;j++)
            {
                System.out.print(""+temp[i][j]+"　 ");

                day_total[j] += temp[i][j];

                if (temp[i][j]>max){
                    max = temp[i][j];
                    max_i = i;
                    max_j = j;
                }

                if (temp[i][j]<min){
                    min = temp[i][j];
                    min_i = i;
                    min_j = j;
                }

            }
            System.out.println();            
        }

        System.out.print("平均氣溫 ");

        for (int i=0;i<day_total.length;i++)
        {   
            System.out.print(String.format("%.1f　 ",day_total[i]/3));
        }
        
        System.out.println();
        System.out.println("溫度最高的日子發生在"+day[max_j]+" "+section[max_i]);
        System.out.println("溫度最低的日子發生在"+day[min_j]+" "+section[min_i]);
    }
}
