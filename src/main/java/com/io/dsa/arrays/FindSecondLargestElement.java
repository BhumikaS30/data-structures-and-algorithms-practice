package com.io.dsa.arrays;

public class FindSecondLargestElement {

    int[] arr;

    public FindSecondLargestElement(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        FindSecondLargestElement findSecondLargestElement =
            new FindSecondLargestElement(new int[] {11, 2, 100, 100, 1, 5});
        findSecondLargestElement.findSecondLargestElementFromArray();
    }

    public int findSecondLargestElementFromArray() {
        int largest = 0;
        int res = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                //If first time/current element is > second largest element till now
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        System.out.println("Second Largest Element is -> " + arr[res]);
        return res;
    }
}
