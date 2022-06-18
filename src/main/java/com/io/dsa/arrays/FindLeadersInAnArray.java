package com.io.dsa.arrays;

/**
 * Leaders are all those elements who have all elements on there right
 * less than themselves
 */
public class FindLeadersInAnArray {

    int[] arr;

    public FindLeadersInAnArray(int[] arr) {
        this.arr = arr;
    }

    public void findAndPrintLeadersInAnArray() {
        int currentLeader = arr[arr.length - 1];

        System.out.println(currentLeader);

        for (int i = arr.length - 2 ; i >= 0; i--) {
            if ( arr[i] > currentLeader) {
                currentLeader = arr[i];
                System.out.println(currentLeader);
            }
        }
    }

    public static void main(String[] args) {
        FindLeadersInAnArray findLeadersInAnArray = new FindLeadersInAnArray(new int[] {7, 10, 4, 10, 6, 5, 2});
        findLeadersInAnArray.findAndPrintLeadersInAnArray();
    }
}
