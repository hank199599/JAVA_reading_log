/*  在數位彩色照片裡,每一個畫素(pixel)的顏色是由紅、綠與藍(red, green 與 blue, 即rgb)三個顏色混色而成的。
    通常rgb的強度可用0-255的數值來表示。數值越大代 表該顏色的強度越強。
    照片的維度是二維,因此恰可用一個二維矩陣來表示它,
    每一個矩陣的元素即代表了一個畫素。但因每一個畫素必須是由紅、綠與藍三個顏色組成,
    於是要正確的表示一張數位彩色照片的資料,必須利用三維矩陣。下面是一個三維矩陣的示意圖,它代表了一個3x3畫素的彩色影像:
*/
public class hw6_13 {
    public static void main(String[] args) {
        
        int flame[][][] = {{{18,172,127},{89,133,136},{175,8,43}},
                           {{234,224,113},{128,151,40},{34,48,75}},
                           {{141,28,192},{127,40,234},{131,228,98}}};

        for (int i = 0;i<flame.length;i++)
        {
            for(int j=0;j<flame[i].length;j++)
            {   
                System.out.print("( ");
                for(int k=0;k<flame[i][j].length;k++)
                {   
                    // 調整 r 值
                    if (k == 0)
                    {
                        flame[i][j][k]+=30;
                        if (flame[i][j][k] > 255)
                            flame[i][j][k] = 255;
                    }

                    // 調整 g 值
                    if (k == 1)
                    {
                        flame[i][j][k]-=30;
                        if (flame[i][j][k] < 0)
                            flame[i][j][k] = 0;
                    }

                    System.out.print(flame[i][j][k]+" ");

                }
                System.out.print(")");
            }
            System.out.println();
        }

    }
}
