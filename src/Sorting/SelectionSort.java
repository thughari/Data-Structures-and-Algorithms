package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums ={6,5,8,9,4,1,10,34,0};
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("After Sorting: "+Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        int temp=0;
    }
}
