package com.william.sandbox;

/**
 */
public class Sandbox {


    /**
     *
     * @param arr Input Array
     * @param data Temporary array to store current combination
     * @param start Staring index in arr[]
     * @param end Ending index in arr[]
     * @param index Current index in data[]
     * @param r Size of a combination to be printed
     */
    public void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    /**
     * The main function that prints all combinations of size r
     * in arr[] of size n. This function mainly uses combinationUtil()
     * int arr[] = {1, 2, 3, 4, 5};
     * int n = arr.length;
     * int r = 3;
     *
     * printCombination(arr, n, r);
     * @param arr The universe of nubers for which we are trying to print combinations.
     * @param n The length of arr.
     * @param r The number of elements in a given combination of arr.
     */
    public void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }

}
