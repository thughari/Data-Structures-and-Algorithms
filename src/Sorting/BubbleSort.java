package Sorting;

import java.util.Arrays;

public class BubbleSort { //Time complexity O(n^2)
    public static void main(String[] args) {
        int[] nums ={6,5,8,9,4};
        System.out.println("Before Sorting: "+Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("After Sorting: "+Arrays.toString(nums));
    }
    public static void bubbleSort(int[] nums){
        int temp=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-1-i;j++) {
                if (nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
