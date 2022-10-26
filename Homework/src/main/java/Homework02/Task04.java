package Homework02;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task04 {

    public static void isStringEmpty() {
        System.out.println("Введите данные: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.isEmpty()){
            throw new RuntimeException("Вводить пустые строки нельзя");
        }
    }


    public static void main(String[] args) {
        try{
            isStringEmpty();
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }

}
