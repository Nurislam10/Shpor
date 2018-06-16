package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main r = new Main();
        r.mainActions();
    }

    private void mainActions(){
// здесь тело Вашей программы
        Scanner scanner = new Scanner(System.in);
        System.out.println("Енгіз ");
        String age = scanner.nextLine();
        switch (age){
            case "ата2о":
                System.out.println("Жауабы\nкәсіпорын экономикасын");
                break;
            case "m3m":
                System.out.println("Енгіз MMMMMM33333333333mmmmmmmm ten eken");
                break;
            default:
                System.out.println("Siz engizgen narse minau "+ age + "\n"+" bizdin bazada jok eken" );
                System.out.print("Вы хотите выйти или продолжить: ");

        }
        repeat();
    }

    private void repeat(){
// выход или продолжение
        Scanner in = new Scanner(System.in);
        System.out.println("Бітті? ба? я/ж");
        try{
            String exit = in.next();
            if (exit.equals("я") || exit.equals("Я")){
                System.exit(0);
            }
            else if (exit.equals("ж") || exit.equals("Ж")){
                mainActions();
            }
            else repeat();
        }
        catch(Exception e){
            System.exit(0);
        }
    }
}
