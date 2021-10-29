package com.ss.fs.basics.five.assignments.two;

public class PartFive {

    Boolean groupSumClump(int start, int[] numbArr, int target) {
        shiftArr(numbArr);
        if (start >= numbArr.length) return target == 0;
        if (groupSumClump(start+1, numbArr, target-numbArr[start])) return true;
        return groupSumClump(start + 1, numbArr, target);
    }

    private void shiftArr(int[] nums) {
        if(nums.length == 0) return;

        int start = 0;
        int index = nums[start];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == index) {
                nums[start] += nums[i];
                nums[i] = 0;
            } else {
                start = i;
                index = nums[i];
            }
        }
    }
}
