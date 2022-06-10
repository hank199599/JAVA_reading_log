
public class hw6_9 {
    public static void main(String[] args) {
        
        int sales[][] = {{33,32,56,45,33},
                         {77,33,68,45,23},
                         {43,55,43,67,65}};

        String product[] ={"產品A","產品B","產品C","產品D","產品E"};

        int product_total[]= new int[5];
        int sales_total[]= new int[3];
        
        for (int i = 0; i<sales.length;i++)
        {   
            int total = 0;

            for (int j = 0; j<sales[i].length;j++)
            {
                total+=sales[i][j];
                System.out.print(sales[i][j]+" ");
                product_total[j]+=sales[i][j];

            }
            sales_total[i] = total;
            System.out.print("銷售員"+(i+1)+"的銷售總金額"+ total+"\n");
        }
        
        for (int j=0;j<product_total.length;j++)
        {
            System.out.println(product[j]+"的銷售總金額 = " + product_total[j]);
        }
        
        System.out.println();
        int max_sales = sales_total[0],sales_index = 0;
        for (int i = 0 ; i<sales_total.length;i++)
        {
            if (max_sales<sales_total[i])
            {
                max_sales=sales_total[i];
                sales_index=i;
            }
        }
        System.out.println("有最好業績的銷售員是"+(sales_index+1));

        int max_product = product_total[0],product_index = 0;
        for (int i = 0 ; i<product_total.length;i++)
        {
            if (max_product<product_total[i])
            {
                max_product=product_total[i];
                product_index=i;
            }
        }
        System.out.println("有最好業績的銷售員是"+product[product_index]);

    }
}
