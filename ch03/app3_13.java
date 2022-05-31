import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class app3_13 {
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in); // 載入 Scanner 類別
        String name;
        int age;

        System.out.print("What's your name?");
        name = scn.nextLine();
        System.out.print("How old are you?");
        age = scn.nextInt();

        System.out.print("Hi, "+name+", you're ");
        System.out.print(age+" years old.");
    }  
}
