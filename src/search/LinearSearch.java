package search;

import java.util.Objects;

public class LinearSearch {
    // tim kiem tuyen tinh : duyet lan luot tung phan tu

    public static void main(String[] args) {
        String[] array = {"Mot","Hai","Ba","Bon","Nam"};
        System.out.println(indexOf(array,"Bon"));
    }
    // mo ta thuat toan tim kiem tuyen tinh (Array)
    public static <T> int indexOf(T[] arr, T t){
        for (int i = 0; i < arr.length; i++) {
            if(Objects.equals(arr[i],t)){
                return i;
            }
        }
        return -1;
    }
}
