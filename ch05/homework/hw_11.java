// package homework;

public class hw_11 {

    public static void main(String[] args) {
       
        int i=1,j=1;

        do{
            j=1;
            do{
                System.out.println(i+"*"+j+"="+(i*j)+"\t");
                j++;
            }while(j<=9);
            i++;
        }while(i<=9);

    }
}