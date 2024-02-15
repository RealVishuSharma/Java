package com.Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] vish = {1,2,3,45,7};

        change(vish);
        System.out.println(Arrays.toString(vish));
    }

    static void change(int[]  nums) {
        nums[0] = 99;
    }


}
