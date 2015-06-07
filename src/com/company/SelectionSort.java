package com.company;

/**
 * Created by simranpreetsnarang on 6/6/15.
 */
public class SelectionSort {

    private int[] a;
    private int lengthOfInput=0;
    public SelectionSort(int[] valuesToSort) {
        this.a = valuesToSort;
        this.lengthOfInput = valuesToSort.length;
    }


    public int[] sort() {
        for(int i=0; i<lengthOfInput-2; i++) {
            int minIndex = i;
            for(int j=i+1; j < lengthOfInput-1; j++) {
                if(a[minIndex] > a[j]) {
                    minIndex = j;
                }
                int temp = a[j];
                a[j] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        return a;
    }

}
