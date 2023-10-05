package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,4,3,46,8,12,89,65);
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
//        insertSort1(arr);
//        insertSort2(arr,Comparator.comparingInt(o -> o));
        System.out.println(Arrays.toString(arr));
    }


    // bubbleSort
    public static <T extends Comparable<T>> void bubbleSort1(T[] arr){
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n-1 && flag; i++) {
            flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
        }
    }
    public static <T> void bubbleSort2(T[] arr, Comparator<T> comparator){
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n-1 && flag; i++) {
            flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(comparator.compare(arr[j],arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
        }
    }

    // selectionSort
    public static <T extends Comparable<T>> void selectionSort1(T[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            T min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(min.compareTo(arr[j]) > 0){
                    minIndex = j;
                    min = arr[j];
                }
            }
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static <T> void selectionSort2(T[] arr, Comparator<T> comparator){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            T min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(comparator.compare(min,arr[j]) > 0){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                arr[i] = arr[minIndex];
                arr[minIndex] = min;
            }
        }
    }

    // insertSort
    public static <T extends Comparable<T>> void insertSort1(T[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j;
            T insert = arr[i];
            for (j = i-1; j >= 0 && insert.compareTo(arr[j]) < 0 ; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = insert;
        }
    }

    public static <T> void insertSort2(T[] arr, Comparator<T> comparator){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j;
            T insert = arr[i];
            for (j = i-1; j >= 0 && comparator.compare(insert,arr[j]) < 0 ; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = insert;
        }
    }
}
