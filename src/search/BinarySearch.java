package search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class BinarySearch {
    // thuat toan tim kiem nhi phan\
    public static void main(String[] args) {
        Person p  = new Person(40);
        Person[] ints = {new Person(23),p, new Person(40),new Person(50),new Person(26)};
        System.out.println(indexOfNoDeQuy(ints, p));
        System.out.println(Arrays.toString(ints));
        System.out.println(indexOfDeQuy(ints,p,0, ints.length-1));
        System.out.println(Arrays.toString(ints));

    }
    // danh sach da duoc sap xep va khong trung lap
    public static <T extends Comparable<T>> int indexOfNoDeQuy(T[] array, T t){
        Arrays.sort(array);
        // sau khi sap xep
        int start = 0;
        int end = array.length -1;
        while (start <= end){
            int mid = start + (start + end)/2;
            if(Objects.equals(array[(int)mid],t)){
                return mid;
            }
            if(array[mid].compareTo(t)<0){
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static <T extends Comparable<T>> int indexOfDeQuy(T[] array, T t, int start, int end){
        Arrays.sort(array);
        // sau khi sap xep
        if (start <= end){
            int mid = start + (start + end)/2;
            if(Objects.equals(array[mid],t)){
                return mid;
            }
            if(array[mid].compareTo(t)<0){
                return indexOfDeQuy(array,t,mid+1,end);
            } else {
                return indexOfDeQuy(array,t,start,mid-1);
            }
        }
        return -1;
    }
}
