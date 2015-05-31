package com.company;

/**
 * Created by simranpreetsnarang on 5/30/15.
 */
public class BubbleSort {
    private int[] a;
    private int lengthOfInput=0;


    public BubbleSort(int[] valuesToSort) {
        this.a = valuesToSort;
        this.lengthOfInput = valuesToSort.length;
    }


    public int[] sort() {
        for(int i = 0; i < lengthOfInput-1; i++) {
            for(int j = 0; j < lengthOfInput - 1 - i; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
