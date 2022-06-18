package com.io.dsa.arrays;

public class MinStepsToReachEndOfArray {

    public static int minJumps(int[] arr){
        // Your code here
        int n=arr.length;

        if (n <= 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump =1;

        int i=1;
        for (i = 1; i < n; i++)
        {
            if (i == n-1)
                return jump;

            maxReach = Math.max(maxReach, i+arr[i]);

            step--;

            if (step == 0)
            {
                jump++;

                if(i >= maxReach)
                    return -1;

                step = maxReach - i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        System.out.println(minJumps(arr));
    }

}
