// package homework;



import java.util.Scanner;

public class hw_19 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入天數: ");
        int day = scn.nextInt();

        switch (day){
            case 1:
                System.out.println("今天要上班");
                break;
            case 2:
                System.out.println("今天要上班");
                break;
            case 3:
                System.out.println("今天要上班");
            case 4:
                System.out.println("今天要上班");
            case 5:
                System.out.println("今天要上班");
            case 6:
                System.out.println("今天休息");
            case 7:
                System.out.println("今天休息");
            default:
                System.out.println("輸入錯誤");
        }
    }
}