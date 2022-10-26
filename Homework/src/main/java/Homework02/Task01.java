package Homework02;
import java.util.InputMismatchException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task01 {

    public static void main(String[] args) {
        System.out.println(getFloat());
    }

    public static float getFloat() {
        System.out.println("Print fractional number: ");
        float num;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextFloat();
        }catch(InputMismatchException ex){
            System.out.println("Incorrect data entered. Print fractional number again: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextFloat();
        }
        return num;
    }
}