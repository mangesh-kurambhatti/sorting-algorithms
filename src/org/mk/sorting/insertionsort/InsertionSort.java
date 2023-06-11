package org.mk.sorting.insertionsort;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("========== INSERTION SORT ============");

        int[] arr = new int[]{5,90,30,4,-2,0,43,28};

        for(int i=1;i<arr.length;i++){
            int key = arr[i];

            int j= i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        for (int a:arr) {
            System.out.println(a);
        }
    }
}
