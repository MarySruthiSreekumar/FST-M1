package activities;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int [] number = {1,3,4,6,12,5,10,2};
        System.out.println("Unsorted Array = " + Arrays.toString(number));
        System.out.println("Sorted Array = " + Arrays.toString(insertionSort2(number)));

    }
    public static int[] insertionSort2(int[] nums){
        for(int i=1;i<nums.length;i++)
        {
            int sortnum = nums[i];
            int j = i-1;
            while(j>=0 && sortnum < nums[j]){

                nums[j+1] = nums[j];
                --j;
            }
            nums[j+1]=sortnum;

        }
        return nums;

    }

}

