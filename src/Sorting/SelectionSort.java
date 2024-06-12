package Sorting;

import java.util.Arrays;

public class SelectionSort { //Time Complexity O(n)
    public static void main(String[] args) {
        int[] nums ={6,5,8,9,4,1,1,10,34,0,0};
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("After Sorting: "+Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        int temp=0;
        int minIndex=0;
        for (int i=0;i<nums.length;i++){
            minIndex=i;
            for(int j=i;j<nums.length;j++){
                if (nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }
    }
}
