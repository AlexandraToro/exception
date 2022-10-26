package sem01;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//если вместо массива пришел null, метод вернет -3

public class Task01 {
    static final int MIN_LENGTH = 11;

    /**
     *
     * @param arr
     * @param num
     * @return
     */
    private static int findIndexOfNum(int[] arr, int num){
        if (arr == null){
            throw new RuntimeException("Array is null");
        }
        if (arr.length<= MIN_LENGTH){throw new RuntimeException("Array length too small");}
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){return i;}
        }
        throw new RuntimeException("Num is not found in Array");
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(findIndexOfNum(array,5));
    }
}
