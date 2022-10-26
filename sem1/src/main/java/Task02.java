//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
//в качестве кода ошибки, иначе - длину массива.

public class Task02 {
    private static int GetLength(int[] arr, int min){
        if (arr.length< min){return -1;}
        else return arr.length;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(GetLength(array,5));
    }
}
