package Homework01;
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя. Важно: При выполнении метода
// единственное исключение, которое пользователь может увидеть
// - RuntimeException, т.е. ваше.

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int [] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arrDiv = divOfArray(arr1,arr2);
        System.out.println(Arrays.toString(arrDiv));
    }

    public static int[] divOfArray(int[] arr1, int[] arr2){
        if(arr1==null || arr2==null){
            throw new RuntimeException("Some array is null");
        }
        if(arr1.length!= arr2.length){
            throw new RuntimeException("Arrays length isn't equal");
        }
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if(arr2[i] == 0){
                throw new RuntimeException("Division by zero is not possible");
            }
            res[i]= arr1[i]/arr2[i];
        }
        return res;
    }
}
