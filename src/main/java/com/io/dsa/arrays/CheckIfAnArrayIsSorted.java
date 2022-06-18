package com.io.dsa.arrays;

public class CheckIfAnArrayIsSorted {

    int[] arr;

    public CheckIfAnArrayIsSorted(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        CheckIfAnArrayIsSorted checkIfAnArrayIsSorted = new CheckIfAnArrayIsSorted(new int[] {11, 2, 100, 100, 1, 5});
        System.out.println(checkIfAnArrayIsSorted.check());
    }

    public boolean check() {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
