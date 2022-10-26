package sem01;

public class Task00 {
    static final int INDEX = 11;

    /**
     * метод возвращает длину массива, если она меньше 11
     * @param arr массив целочисленный
     * @return возвращает -1 если длина больше 11
     */
    private static int GetLength(int[] arr){
        if (arr.length< INDEX){return -1;}
        else return arr.length;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(GetLength(array));
    }
}
