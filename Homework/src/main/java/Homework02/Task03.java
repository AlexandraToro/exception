package Homework02;

// Если считать,что все данные заданы уже в самом методе, то по сути деление на ноль и прочие проверки не нужны, только выход за пределы массива
// Если бы был вариант ввода других значений переменных, то проверок исключений потребовалосбь бы больше, но вроде как надо идти по первому варианту по заданию.

public class Task03 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) throws IllegalArgumentException {
        System.out.println(a + b);
    }

}
