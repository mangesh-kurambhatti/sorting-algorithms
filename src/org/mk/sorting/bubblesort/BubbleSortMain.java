package org.mk.sorting.bubblesort;


import java.util.Arrays;

public class BubbleSortMain {

    public static void main(String[] args) {
        System.out.println("Bubble Sort ...!");

        int[] arr = new int[]{5,90,30,4,-2,0,43,28};

        for(int i=arr.length-1;i>= 1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int a:arr) {
            System.out.println(a);
        }

    }
}
