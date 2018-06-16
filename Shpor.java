package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main r = new Main();
        r.mainActions();
    }
    private void mainActions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------- ");
        String str1 = scanner.nextLine();
        count(str1);
        repeat();
    }
    private void count(String str1) {
        char[] ch = str1.toCharArray();

        int space = 0;
        for(int i = 0; i < str1.length(); i++){

            if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
        }
        String age = str1.substring(0, 3);
        char ch1 = str1.charAt(str1.lastIndexOf(' ')+1);
        System.out.println(age+(space-1)+ch1);
    }
    private void repeat(){
        mainActions();

    }
}
