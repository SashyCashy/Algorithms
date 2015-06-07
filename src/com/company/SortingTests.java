package com.company;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by simranpreetsnarang on 5/30/15.
 */
public class SortingTests {

    int input[] = {12, 10, 8, 6, 4};
    int[] expectedResult = {4, 6, 8, 10, 12};
    BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort(input);
    }

    @Test
    public void bubbleSortTest() {
        int[] result = bubbleSort.sort();
        Assert.assertArrayEquals(expectedResult, result);
    }


    @Test
    public void insertionSortTest() {
        int[] result = bubbleSort.sort();
        Assert.assertArrayEquals(expectedResult, result);
    }

}
