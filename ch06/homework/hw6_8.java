
public class hw6_8 {
    public static void main(String[] args) {
        
        double temp[][] = {{18.2,23.8,20.6},
                           {17.3,25.1,21.5},
                           {15.0,20.6,18.4},
                           {13.4,17.8,15.7}};

        String day[] ={"星期一","星期二","星期三","星期四"};
        String section[] ={"時段一","時段二","時段三"};
        
        int section1=0,section2=0,section3=0;
        
        double max = temp[0][0],min = temp[0][0];
        int max_i=0,max_j=0;
        int min_i=0,min_j=0;

        for (int i = 0; i<temp.length;i++)
        {   
            int total = 0;
            System.out.print(day[i]+"\t ");
            for (int j = 0; j<temp[i].length;j++)
            {
                total+=temp[i][j];
                System.out.print(temp[i][j]+" ");

                switch(j){
                    case 0:
                        section1+=temp[i][j];
                    case 1:
                        section2+=temp[i][j];
                    case 2:
                        section3+=temp[i][j];
                }

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
            System.out.print("平均氣溫 = "+(double) total/3+"\n");
        }
        System.out.println("時段一的平均氣溫= " +  (double) section1/3);
        System.out.println("時段二的平均氣溫 = " + (double) section2/3);
        System.out.println("時段三的平均氣溫 = " + (double) section3/3);
        System.out.println();
        System.out.println("溫度最高的日子發生在"+day[max_i]+" "+section[max_j]);
        System.out.println("溫度最低的日子發生在"+day[min_i]+" "+section[min_j]);
    }
}
