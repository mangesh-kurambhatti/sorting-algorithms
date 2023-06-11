package org.mk.sorting.quicksort;

public class QickSort {
    public static void main(String[] args) {
        System.out.println("========== QUICK SORT ============");

        int[] arr = new int[]{5,90,30,4,-2,0,43,28};

        quickSort(arr,0,arr.length-1);

        for (int a:arr  ) {
            System.out.println(a);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {

        if(low < high){

            int partitionIndex= arr(arr,low,high);

            quickSort(arr, low, partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }

    }

    private static int arr(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i=low;
        int j=high;
        while (i<j){

            while (arr[i] <= pivot && i<=high-1)
                i++;

            while (arr[j] >= pivot && j>=low+1)
                j--;

            if(i<j){
                //swapping element
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swapping element with pivot as j represents the pivot position
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;

        return j;
    }
}
