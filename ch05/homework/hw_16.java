// package homework;

import java.util.Scanner;

public class hw_16 {

    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);

        int input;          // 用來儲存使用者輸入的密碼的變數
        int cnt = 0;        // 用來計數密碼輸入的次數的變數
        int passwd = 6128;  // 預設正確的密碼為 6128

        while(true)
        {
            System.out.print("請輸入密碼: ");
            input = scn.nextInt();
            cnt++;
            // 請在此輸入程式碼，已完成本題的要求
            if (input == passwd)
                {
                    System.out.print("密碼輸入正確，歡迎使用本系統 ");
                    break;
                }
            else{
                if (cnt > 2)
                {
                    System.out.print("密碼輸入超過三次!!! ");
                    break;
                }
            }
        }
    }
}